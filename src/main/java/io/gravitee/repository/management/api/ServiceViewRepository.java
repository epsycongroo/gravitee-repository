/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.repository.management.api;

import io.gravitee.repository.exceptions.TechnicalException;
import io.gravitee.repository.management.model.ServiceView;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author Jokki
 */
public interface ServiceViewRepository extends CrudRepository<ServiceView, String> {

    Set<ServiceView> findAll() throws TechnicalException;

    Optional<ServiceView> findMaxOrderByPid(String pid) throws TechnicalException;

    List<String> deleteByPid(String pid) throws TechnicalException;

    void updateOrderByPid(String pid, int post, int number) throws TechnicalException;
}