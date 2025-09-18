package com.facebook.react.devsupport;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import defpackage.Y02;

/* loaded from: classes.dex */
public final class a extends Y02 {
    public final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate a;

    public a(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        this.a = webSocketDelegate;
    }

    @Override // defpackage.Y02
    public final void d(int i, String str) {
        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.a;
        webSocketDelegate.didClose();
        webSocketDelegate.close();
    }

    @Override // defpackage.Y02
    public final void f(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "<Unknown error>";
        }
        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.a;
        webSocketDelegate.didFailWithError(null, message);
        webSocketDelegate.close();
    }

    @Override // defpackage.Y02
    public final void h(String str) {
        this.a.didReceiveMessage(str);
    }
}
