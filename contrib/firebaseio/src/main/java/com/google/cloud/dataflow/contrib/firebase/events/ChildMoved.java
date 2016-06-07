/**
 * Copyright (c) 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not  use this file except  in compliance with the License. You may obtain
 * a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.dataflow.contrib.firebase.events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.firebase.client.DataSnapshot;

/**
 * TODO: Insert description here. (generated by elibixby)
 * @param <T> type that {@link DataSnapshot} is parsed as.
 */
public class ChildMoved<T> extends FirebaseChildEvent<T> {

  @JsonCreator
  public ChildMoved(
      @JsonProperty("key") String key,
      @JsonProperty("data") T data,
      @JsonProperty("previousChildName") String previousChildName) {
      super(key, data, previousChildName);
  }

  public ChildMoved(DataSnapshot snapshot, String previousChildName){
    super(snapshot, previousChildName);
  }

}
