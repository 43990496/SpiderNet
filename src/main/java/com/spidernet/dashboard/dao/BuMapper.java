package com.spidernet.dashboard.dao;

import java.util.List;

import com.spidernet.dashboard.entity.Bu;

public interface BuMapper
{
    Bu findBuName(String buId);
    List<Bu> queryBu();
}
