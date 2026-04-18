package com.portsang.portfolio.admin.data

import javax.swing.table.TableColumn

class TableDTO(
    val name: String,
    val columns: List<String>,
    val records: List<List<String>>
) {

}