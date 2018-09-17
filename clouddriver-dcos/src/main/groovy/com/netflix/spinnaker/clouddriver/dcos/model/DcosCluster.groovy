/*
 * Copyright 2017 Cerner Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.netflix.spinnaker.clouddriver.dcos.model

import com.netflix.spinnaker.clouddriver.dcos.cache.Keys
import com.netflix.spinnaker.clouddriver.model.Cluster
import com.netflix.spinnaker.clouddriver.model.LoadBalancer

class DcosCluster implements Cluster, Serializable {
  String name
  String type = Keys.PROVIDER
  String accountName
  Set<DcosServerGroup> serverGroups = Collections.synchronizedSet(new HashSet<DcosServerGroup>())
  Set<LoadBalancer> loadBalancers = Collections.synchronizedSet(new HashSet<DcosLoadBalancer>())
  Set<String> secrets
}
