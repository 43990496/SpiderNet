package com.spidernet.dashboard.service.impl;
/**
 * rule
 * @author Lulu
 *
 */
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spidernet.dashboard.dao.RuleMapper;
import com.spidernet.dashboard.entity.Rule;
import com.spidernet.dashboard.entity.RulePageCondition;
import com.spidernet.dashboard.service.RuleService;


@Service
public class RuleServiceImpl implements RuleService
{

    @Resource
    private RuleMapper ruleMapper;

    @Override
    public boolean addRule(Rule rule)
    {
        if(ruleMapper.addRule(rule)>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<Rule> queryRuleInfo(
    		RulePageCondition rulePageCondition)
    {
        List<Rule> trainningList = ruleMapper.queryRuleInfo(rulePageCondition);
        return trainningList;
    }

    @Override
    public int countRulePage(RulePageCondition rulePageCondition)
    {
    	int result =ruleMapper.countRulePage(rulePageCondition);
    	if(result % 10 > 0)
    	{
    		return result / 10 + 1;
    	}else {
    		return result / 10;
    	}
    	
        
    }

    @Override
    public List<Rule> queryRuleByName(String ruleName)
    {
        List<Rule> ruleList = ruleMapper.queryRuleByName(ruleName);
        return ruleList;
    }

    @Override
    public List<Rule> queryRuleName()
    {
        List<Rule> ruleList = ruleMapper.queryRuleName();

        return ruleList;
    }

    @Override
    public Rule queryRuleById(String id)
    {
    	Rule rule = ruleMapper.queryRuleById(id);
        return rule;
    }
    
    @Override
    public Boolean editRule(Rule rule)
    {
        if (ruleMapper.editRule(rule) > 0)
        {
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public Boolean deleteRule(Rule rule)
    {
        if (ruleMapper.deleteRule(rule) > 0)
        {
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public Boolean checkNameExists(String name)
    {
        if(ruleMapper.checkNameExists(name)>0){
            return false;
        }else{
            return true;
        }
    }

}
