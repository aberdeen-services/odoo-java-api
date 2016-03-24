/*
 * Copyright 2015 Aberdeen Broadcast Services.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.abercap.odoo;

import java.util.ArrayList;
import java.util.HashMap;

/***
 * Row collection for Odoo row data
 * @author Pieter van der Merwe
 *
 */
public class RowCollection extends ArrayList<Row> {

	private static final long serialVersionUID = -168965138153400087L;
	
	public RowCollection(){
	}

	@SuppressWarnings("unchecked")
	public RowCollection(Object [] odooResultSet, FieldCollection fields) throws OdooApiException{
		for (int i = 0; i < odooResultSet.length; i++){
			Row row = new Row((HashMap<String, Object>) odooResultSet[i], fields);
			this.add(row);
		}
	}

	@Override
	public void add(int index, Row element) {
		super.add(index, element);
	}

	@Override
	public boolean add(Row e) {
		return super.add(e);
	}
}
