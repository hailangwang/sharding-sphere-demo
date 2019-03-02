package com.config.sharing.table;/**
 * Created by 168 on 2019/3/2.
 */

import io.shardingjdbc.core.api.config.TableRuleConfiguration;
import io.shardingjdbc.core.api.config.strategy.InlineShardingStrategyConfiguration;

/**
 * @description
 * @author: hailang
 * @create: 2019-03-02 18:36
 */
public class GlSjpmbRuleConfig  {






    public TableRuleConfiguration userRuleConfig() {

        TableRuleConfiguration tableRuleConfig = new TableRuleConfiguration();
        tableRuleConfig.setLogicTable("gl_sj_pzmb_test");
        tableRuleConfig.setActualDataNodes("ds${0}.gl_sj_pzmb_test${0..1}");
        tableRuleConfig.setKeyGeneratorColumnName("K_ZTDM");
        // 配置分库 +
//        tableRuleConfig.setDatabaseShardingStrategyConfig(new InlineShardingStrategyConfiguration("K_ZTDM", "ds${K_ZTDM % 2}"));
//        分表策略
        tableRuleConfig.setTableShardingStrategyConfig(new InlineShardingStrategyConfiguration("sex", "t_user${sex % 2}"));
        return tableRuleConfig;
    }




}
