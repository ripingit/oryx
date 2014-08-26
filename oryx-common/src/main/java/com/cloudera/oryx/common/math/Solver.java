/*
 * Copyright (c) 2013, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */

package com.cloudera.oryx.common.math;

import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;

/**
 * Encapsulates a {@link DecompositionSolver} from Commons Math.
 */
public final class Solver {
  
  private final DecompositionSolver solver;
  
  Solver(DecompositionSolver solver) {
    this.solver = solver;
  }

  public double[] solveFToD(float[] b) {
    return solver.solve(new ArrayRealVector(VectorMath.toDoubles(b), false)).toArray();
  }

  public double[] solveDToD(double[] b) {
    return solver.solve(new ArrayRealVector(b, false)).toArray();
  }

}
