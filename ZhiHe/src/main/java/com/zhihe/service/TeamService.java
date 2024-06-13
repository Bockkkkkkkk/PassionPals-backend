package com.zhihe.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhihe.model.domain.Team;
import com.zhihe.model.domain.User;
import com.zhihe.model.dto.TeamQuery;
import com.zhihe.model.request.TeamJoinRequest;
import com.zhihe.model.request.TeamQuitRequest;
import com.zhihe.model.request.TeamUpdateRequest;
import com.zhihe.model.vo.TeamUserVO;

import java.util.List;

/**
* @author 86184
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-02-19 12:37:54
*/
public interface TeamService extends IService<Team> {

    long addTeam(Team team, User loginUser);

    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 加入队伍
     *
     * @param teamJoinRequest
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     *
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除（解散）队伍
     *
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);
}
