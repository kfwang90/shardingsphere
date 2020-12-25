/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.infra.executor.sql.execute.engine.driver.jdbc.sane;

import org.apache.shardingsphere.infra.database.type.DatabaseType;
import org.apache.shardingsphere.infra.executor.sql.execute.engine.driver.jdbc.JDBCExecutionUnit;
import org.apache.shardingsphere.infra.executor.sql.execute.result.query.QueryResult;
import org.apache.shardingsphere.infra.spi.typed.TypedSPI;
import org.apache.shardingsphere.sql.parser.sql.common.statement.SQLStatement;

import java.sql.SQLException;
import java.util.Optional;

/**
 * JDBC sane query result engine.
 */
public interface JDBCSaneQueryResultEngine extends TypedSPI {
    
    /**
     * Get sane query result.
     * 
     * @param sqlStatement SQL statement
     * @param jdbcExecutionUnit JDBC execution unit
     * @param targetDatabaseType target database type
     * @return sane query result
     * @throws SQLException SQL exception
     */
    Optional<QueryResult> getSaneQueryResult(SQLStatement sqlStatement, JDBCExecutionUnit jdbcExecutionUnit, DatabaseType targetDatabaseType) throws SQLException;
}