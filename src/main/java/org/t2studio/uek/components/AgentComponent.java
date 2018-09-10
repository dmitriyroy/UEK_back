package org.t2studio.uek.components;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.t2studio.uek.domain.Agent;
import org.t2studio.uek.mapper.AgentMapper;

@Component
public class AgentComponent {

    private AgentMapper agentMapper;

    @Autowired
    public void setAgentMapper(AgentMapper agentMapper) {
        this.agentMapper = agentMapper;
    }

    /**
     * Создаем нового агента
     * @param agent
     * @return кол-во созданных записей
     */
    public int create(Agent agent) {
        return agentMapper.create(agent);
    }
    
    /**
     * Получаем список всех агентов
     * @return кол-во созданных записей
     */
    public List<Agent> getAll() {
        return agentMapper.getAll();
    }
    
}