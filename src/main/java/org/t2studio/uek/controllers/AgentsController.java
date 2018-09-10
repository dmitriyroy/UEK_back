
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.t2studio.uek.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.t2studio.uek.components.AgentComponent;
import org.t2studio.uek.domain.Agent;

@RestController
@RequestMapping("/agents")
public class AgentsController {
    private AgentComponent agentComponent;

    @Autowired
    public void setAgentComponent(AgentComponent agentComponent) {
        this.agentComponent = agentComponent;
    }
    
    @PostMapping(value = "/create",
                 headers = {"accept=application/json"})
    @ResponseBody
    public int create(@RequestBody Agent params) {
        int res = agentComponent.create(params);
        return res;
    }
    
    @GetMapping(value = "/getall",
                 headers = {"accept=application/json"})
    @ResponseBody
    public List<Agent> getAll() {
        return agentComponent.getAll();
    }
    
}
