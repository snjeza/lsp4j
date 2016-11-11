package org.eclipse.lsp4j;

import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * The document close notification is sent from the client to the server when the document got closed in the client.
 * The document's truth now exists where the document's uri points to (e.g. if the document's uri is a file uri the
 * truth now exists on disk).
 */
@SuppressWarnings("all")
public class DidCloseTextDocumentParams {
  /**
   * The document that was closed.
   */
  @NonNull
  private TextDocumentIdentifier textDocument;
  
  /**
   * The document that was closed.
   */
  @Pure
  public TextDocumentIdentifier getTextDocument() {
    return this.textDocument;
  }
  
  /**
   * The document that was closed.
   */
  public void setTextDocument(final TextDocumentIdentifier textDocument) {
    this.textDocument = textDocument;
  }
  
  public DidCloseTextDocumentParams() {
    
  }
  
  public DidCloseTextDocumentParams(final TextDocumentIdentifier textDocument) {
    this.textDocument = textDocument;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("textDocument", this.textDocument);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    if (!super.equals(obj))
      return false;
    DidCloseTextDocumentParams other = (DidCloseTextDocumentParams) obj;
    if (this.textDocument == null) {
      if (other.textDocument != null)
        return false;
    } else if (!this.textDocument.equals(other.textDocument))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.textDocument== null) ? 0 : this.textDocument.hashCode());
    return result;
  }
}
