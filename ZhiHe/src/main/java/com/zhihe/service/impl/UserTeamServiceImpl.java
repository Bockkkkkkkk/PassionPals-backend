package com.zhihe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhihe.model.domain.UserTeam;
import com.zhihe.mapper.UserTeamMapper;
import com.zhihe.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
* @author 86184
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2024-02-19 12:37:54
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService {

}




