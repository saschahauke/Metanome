/*
 * Copyright 2015 by the Metanome project
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

package de.metanome.frontend.client.results.pagination_table;

import com.google.gwt.user.cellview.client.TextColumn;

import de.metanome.backend.result_postprocessing.result_comparator.OrderDependencyResultComparator;
import de.metanome.backend.result_postprocessing.results.OrderDependencyResult;
import de.metanome.backend.results_db.ResultType;

import java.util.ArrayList;
import java.util.List;

/**
 * Pagination table for order dependency results.
 */
public class OrderDependencyPaginationTable
    extends AbstractPaginationTable<OrderDependencyResult> {

  /**
   * Constructs the table for given result type
   *
   * @param resultType the result type
   */
  public OrderDependencyPaginationTable(ResultType resultType) {
    super(resultType);
  }

  /**
   * Initializes the table columns
   *
   * @return Returns the list of sort properties for sortable columns
   */
  @Override
  protected List<String> initializeColumns() {
    List<String> columnNames = new ArrayList<>();

    // lhs column
    TextColumn<OrderDependencyResult> lhsColumn = new TextColumn<OrderDependencyResult>() {
      @Override
      public String getValue(OrderDependencyResult orderDependency) {
        return orderDependency.getLhs().toString();
      }
    };
    this.table.addColumn(lhsColumn, "LHS");
    columnNames.add(OrderDependencyResultComparator.LHS_COLUMN);

    // rhs column
    TextColumn<OrderDependencyResult> rhsColumn = new TextColumn<OrderDependencyResult>() {
      @Override
      public String getValue(OrderDependencyResult orderDependency) {
        return orderDependency.getRhs().toString();
      }
    };
    this.table.addColumn(rhsColumn, "RHS");
    columnNames.add(OrderDependencyResultComparator.RHS_COLUMN);

    // lhs column ratio column
    TextColumn<OrderDependencyResult> lhsColumnRatioColumn = new TextColumn<OrderDependencyResult>() {
      @Override
      public String getValue(OrderDependencyResult orderDependency) {
        return String.valueOf(orderDependency.getLhsColumnRatio());
      }
    };
    this.table.addColumn(lhsColumnRatioColumn, "LHS Column Ratio");
    columnNames.add(OrderDependencyResultComparator.LHS_COLUMN_RATIO);

    // rhs column ratio column
    TextColumn<OrderDependencyResult> rhsColumnRatioColumn = new TextColumn<OrderDependencyResult>() {
      @Override
      public String getValue(OrderDependencyResult orderDependency) {
        return String.valueOf(orderDependency.getRhsColumnRatio());
      }
    };
    this.table.addColumn(rhsColumnRatioColumn, "RHS Column Ratio");
    columnNames.add(OrderDependencyResultComparator.RHS_COLUMN_RATIO);

    // coverage column
    TextColumn<OrderDependencyResult> coverageColumn = new TextColumn<OrderDependencyResult>() {
      @Override
      public String getValue(OrderDependencyResult orderDependency) {
        return String.valueOf(orderDependency.getGeneralCoverage());
      }
    };
    this.table.addColumn(coverageColumn, "General Coverage");
    columnNames.add(OrderDependencyResultComparator.COVERAGE);

    // lhs occurrence ratio column
    TextColumn<OrderDependencyResult> lhsOccurrenceRatioColumn = new TextColumn<OrderDependencyResult>() {
      @Override
      public String getValue(OrderDependencyResult orderDependency) {
        return String.valueOf(orderDependency.getLhsOccurrenceRatio());
      }
    };
    this.table.addColumn(lhsOccurrenceRatioColumn, "LHS Occurrence Ratio");
    columnNames.add(OrderDependencyResultComparator.LHS_OCCURRENCE_RATIO);

    // rhs occurrence ratio column
    TextColumn<OrderDependencyResult> rhsOccurrenceRatioColumn = new TextColumn<OrderDependencyResult>() {
      @Override
      public String getValue(OrderDependencyResult orderDependency) {
        return String.valueOf(orderDependency.getRhsOccurrenceRatio());
      }
    };
    this.table.addColumn(rhsOccurrenceRatioColumn, "RHS Occurrence Ratio");
    columnNames.add(OrderDependencyResultComparator.RHS_OCCURRENCE_RATIO);

    // lhs uniqueness ratio column
    TextColumn<OrderDependencyResult> lhsUniquenessRatioColumn = new TextColumn<OrderDependencyResult>() {
      @Override
      public String getValue(OrderDependencyResult orderDependency) {
        return String.valueOf(orderDependency.getLhsUniquenessRatio());
      }
    };
    this.table.addColumn(lhsUniquenessRatioColumn, "LHS Uniqueness Ratio*");
    columnNames.add(OrderDependencyResultComparator.LHS_UNIQUENESS_RATIO);

    // rhs uniqueness ratio column
    TextColumn<OrderDependencyResult> rhsUniquenessRatioColumn = new TextColumn<OrderDependencyResult>() {
      @Override
      public String getValue(OrderDependencyResult orderDependency) {
        return String.valueOf(orderDependency.getRhsUniquenessRatio());
      }
    };
    this.table.addColumn(rhsUniquenessRatioColumn, "RHS Uniqueness Ratio");
    columnNames.add(OrderDependencyResultComparator.RHS_UNIQUENESS_RATIO);

    // Set all columns as sortable
    for (int i = 0; i < table.getColumnCount(); i++) {
      table.getColumn(i).setSortable(true);
      table.getColumn(i).setDefaultSortAscending(true);
    }

    return columnNames;
  }

}