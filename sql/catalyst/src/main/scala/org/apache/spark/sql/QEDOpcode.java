/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.sql;

public enum QEDOpcode {
    OP_BD1(11),
    OP_BD2(10),
    OP_SORT_INTEGERS_TEST(90),
    OP_SORT_COL1(2),
    OP_SORT_COL2(50),
    OP_SORT_COL1_COL2(54),
    OP_SORT_COL2_IS_DUMMY_COL1(53),
    OP_SORT_COL3_IS_DUMMY_COL1(52),
    OP_SORT_COL4_IS_DUMMY_COL2(51),
    OP_GROUPBY_COL1_SUM_COL2_INT_STEP1(102),
    OP_GROUPBY_COL1_SUM_COL2_INT_STEP2(103),
    OP_GROUPBY_COL1_SUM_COL2_FLOAT_STEP1(107),
    OP_GROUPBY_COL1_SUM_COL2_FLOAT_STEP2(108),
    OP_GROUPBY_COL2_SUM_COL3_INT_STEP1(1),
    OP_GROUPBY_COL2_SUM_COL3_INT_STEP2(101),
    OP_GROUPBY_COL1_AVG_COL2_INT_SUM_COL3_FLOAT_STEP1(104),
    OP_GROUPBY_COL1_AVG_COL2_INT_SUM_COL3_FLOAT_STEP2(105),
    OP_GROUPBY_COL1_COL2_SUM_COL3_FLOAT_STEP1(109),
    OP_GROUPBY_COL1_COL2_SUM_COL3_FLOAT_STEP2(110),
    OP_JOIN_COL1(106),
    OP_JOIN_COL2(3),
    OP_JOIN_PAGERANK(37),
    OP_JOIN_TPCH9GENERIC_NATION(111),
    OP_JOIN_TPCH9GENERIC_SUPPLIER(112),
    OP_JOIN_TPCH9GENERIC_ORDERS(113),
    OP_JOIN_TPCH9GENERIC_PARTSUPP(114),
    OP_JOIN_TPCH9GENERIC_PART_LINEITEM(115),
    OP_JOIN_TPCH9OPAQUE_NATION(116),
    OP_JOIN_TPCH9OPAQUE_SUPPLIER(117),
    OP_JOIN_TPCH9OPAQUE_ORDERS(118),
    OP_JOIN_TPCH9OPAQUE_LINEITEM(119),
    OP_JOIN_TPCH9OPAQUE_PART_PARTSUPP(120),
    OP_FILTER_COL2_GT3(30),
    OP_FILTER_NOT_DUMMY(32),
    OP_FILTER_COL1_DATE_BETWEEN_1980_01_01_AND_1980_04_01(34),
    OP_FILTER_COL2_CONTAINS_MAROON(38),
    OP_PROJECT_PAGERANK_WEIGHT_RANK(35),
    OP_PROJECT_PAGERANK_APPLY_INCOMING_RANK(36),
    OP_PROJECT_TPCH9GENERIC(43),
    OP_PROJECT_TPCH9OPAQUE(45),
    OP_PROJECT_TPCH9_ORDER_YEAR(44),
    OP_PROJECT_ADD_RANDOM_ID(39),
    OP_PROJECT_DROP_COL1(40),
    OP_PROJECT_DROP_COL2(46),
    OP_PROJECT_SWAP_COL1_COL2(41),
    OP_PROJECT_SWAP_COL2_COL3(42),

    OP_GROUPBY_COL1_SUM_COL2_INT(300),
    OP_GROUPBY_COL1_SUM_COL2_FLOAT(301),
    OP_GROUPBY_COL1_AVG_COL2_INT_SUM_COL3_FLOAT(302);
    private int _value;

    private QEDOpcode(int _value) {
        this._value = _value;
    }

    public int value() {
        return _value;
    }

    public boolean isJoin() {
        return this == OP_JOIN_COL1 || this == OP_JOIN_COL2 || this == OP_JOIN_PAGERANK
            || this == OP_JOIN_TPCH9GENERIC_NATION || this == OP_JOIN_TPCH9GENERIC_SUPPLIER
            || this == OP_JOIN_TPCH9GENERIC_ORDERS || this == OP_JOIN_TPCH9GENERIC_PARTSUPP
            || this == OP_JOIN_TPCH9GENERIC_PART_LINEITEM
            || this == OP_JOIN_TPCH9OPAQUE_NATION || this == OP_JOIN_TPCH9OPAQUE_SUPPLIER
            || this == OP_JOIN_TPCH9OPAQUE_ORDERS || this == OP_JOIN_TPCH9OPAQUE_LINEITEM
            || this == OP_JOIN_TPCH9OPAQUE_PART_PARTSUPP;
    }
}
