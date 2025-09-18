package com.facebook.react.devsupport;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import p000.Y02;

/* renamed from: com.facebook.react.devsupport.a */
/* loaded from: classes.dex */
public final class C1915a extends Y02 {

    /* renamed from: a */
    public final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate f17908a;

    public C1915a(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        this.f17908a = webSocketDelegate;
    }

    @Override // p000.Y02
    /* renamed from: d */
    public final void mo2415d(int i, String str) {
        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.f17908a;
        webSocketDelegate.didClose();
        webSocketDelegate.close();
    }

    @Override // p000.Y02
    /* renamed from: f */
    public final void mo2417f(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "<Unknown error>";
        }
        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.f17908a;
        webSocketDelegate.didFailWithError(null, message);
        webSocketDelegate.close();
    }

    @Override // p000.Y02
    /* renamed from: h */
    public final void mo2419h(String str) {
        this.f17908a.didReceiveMessage(str);
    }
}
