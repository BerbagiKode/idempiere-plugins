package com.rifqi.factory;

import org.adempiere.webui.editor.IEditorConfiguration;
import org.adempiere.webui.editor.WEditor;
import org.adempiere.webui.factory.IEditorFactory;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.DisplayType;

import com.rifqi.component.WAutoDropTableDirEditor;

public class EditorFactory implements IEditorFactory {

	@Override
	public WEditor getEditor(GridTab gridTab, GridField gridField, boolean tableEditor) {
		// TODO Auto-generated method stub
		return getEditor(gridTab, gridField, tableEditor, null);
	}

	@Override
	public WEditor getEditor(GridTab gridTab, GridField gridField, boolean tableEditor,
			IEditorConfiguration editorConfiguration) {
		// TODO Auto-generated method stub
		if (gridField == null) {
			return null;
		}

		WEditor editor = null;
		int displayType = gridField.getDisplayType();

		/** Not a Field */
		if (gridField.isHeading()) {
			return null;
		}

		if (displayType == DisplayType.TableDir && gridField.isAutocomplete()) {
			editor = new WAutoDropTableDirEditor(gridField, tableEditor, editorConfiguration);
		}

		return editor;
	}

}
