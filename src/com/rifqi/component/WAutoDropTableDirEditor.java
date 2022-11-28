package com.rifqi.component;

import org.adempiere.webui.editor.IEditorConfiguration;
import org.adempiere.webui.editor.WTableDirEditor;
import org.compiere.model.GridField;

public class WAutoDropTableDirEditor extends WTableDirEditor {

	public WAutoDropTableDirEditor(GridField gridField, boolean tableEditor, IEditorConfiguration editorConfiguration) {
		super(gridField, tableEditor, editorConfiguration);
		getComponent().setAutodrop(gridField.isAutocomplete());
	}

}
