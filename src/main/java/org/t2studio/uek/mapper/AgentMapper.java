package org.t2studio.uek.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.t2studio.uek.domain.Agent;

@Mapper
public interface AgentMapper {
    int create(Agent agent);
    List<Agent> getAll();
}