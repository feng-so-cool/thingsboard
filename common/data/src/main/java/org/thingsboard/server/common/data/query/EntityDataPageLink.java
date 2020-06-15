/**
 * Copyright © 2016-2020 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.data.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class EntityDataPageLink {

    private final int pageSize;
    private final int page;
    private final String textSearch;
    private final EntityDataSortOrder sortOrder;

    @JsonIgnore
    public EntityDataPageLink nextPageLink() {
        return new EntityDataPageLink(this.pageSize, this.page+1, this.textSearch, this.sortOrder);
    }

}