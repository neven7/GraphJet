/**
 * Copyright 2016 Twitter. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.twitter.graphjet.demo;

/**
 * A container object for holding a node (node id) and an associated value, for insertion into a priority queue, heap,
 * or some similar data structure.
 */
public class NodeValueEntry implements Comparable<NodeValueEntry> {
  private final long node;
  private final double value;

  public NodeValueEntry(long node, double value) {
    this.node = node;
    this.value = value;
  }

  public long getNode() {
    return node;
  }

  public double getValue() {
    return value;
  }

  @Override
  public int compareTo(NodeValueEntry other) {
    if (this.value < other.value) {
      return -1;
    }

    if (this.value > other.value) {
      return 1;
    }

    return this.node < other.node ? -1 : 1;
  }

  @Override
  public String toString() {
    return "(" + this.node + ", " + this.value + ")";
  }
}