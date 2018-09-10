/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.t2studio.uek.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zheka
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Agent implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String agGuid;
    private Integer agType;
    private Long agId;
    private String agName;
    
}
