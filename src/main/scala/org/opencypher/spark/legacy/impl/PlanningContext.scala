package org.opencypher.spark.legacy.impl

import org.apache.spark.sql.Dataset
import org.opencypher.spark.prototype.api.value.{CypherNode, CypherRelationship}
import org.opencypher.spark.legacy.impl.util.SlotSymbolGenerator

class PlanningContext(val slotNames: SlotSymbolGenerator,
                      val nodes: Dataset[CypherNode],
                      val relationships: Dataset[CypherRelationship]) {

  def newSlotSymbol(field: StdField): Symbol =
    slotNames.newSlotSymbol(field)
}







