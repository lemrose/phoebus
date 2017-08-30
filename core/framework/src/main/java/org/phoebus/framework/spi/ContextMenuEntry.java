package org.phoebus.framework.spi;

import java.util.List;

import org.phoebus.framework.selection.Selection;

import javafx.stage.Stage;

/**
 * Context menu entry service interface
 *
 * @author Kunal Shroff
 * @param <V>
 *
 */
public interface ContextMenuEntry<V> {

    public String getName();

    public Object getIcon();

    /** @return Selection types for which this entry should be displayed */
    public List<Class> getSupportedTypes();

    /** Invoke the context menu
     *  @param parent_stage Stage that invoked the menu
     *  @param selection Current selection
     *  @return TODO What does it return??
     *  @throws Exception on error
     */
    public V callWithSelection(Stage parent_stage, Selection selection) throws Exception;
}