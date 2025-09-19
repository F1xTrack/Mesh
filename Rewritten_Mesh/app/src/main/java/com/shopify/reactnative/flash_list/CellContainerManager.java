package com.shopify.reactnative.flash_list;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.C1122Rq;
import p000.C1185Sq;
import p000.C1248Tq;
import p000.InterfaceC1311Uq;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = AutoLayoutViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m22267d2 = {"Lcom/shopify/reactnative/flash_list/CellContainerManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LRq;", "LUq;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LEk1;", "getDelegate", "()LEk1;", "LS91;", "context", "createViewInstance", "(LS91;)LRq;", "view", "", "index", "LTf1;", "setIndex", "(LRq;I)V", "LTq;", "mDelegate", "LTq;", "Companion", "Sq", "shopify_flash-list_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CellContainerManager extends ViewGroupManager<C1122Rq> implements InterfaceC1311Uq {
    public static final C1185Sq Companion = new C1185Sq();
    public static final String REACT_CLASS = "CellContainer";
    private final C1248Tq mDelegate = new C1248Tq(5, this);

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1122Rq createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        C1122Rq c1122Rq = new C1122Rq(context);
        c1122Rq.f10444a = -1;
        return c1122Rq;
    }

    @Override // p000.InterfaceC1311Uq
    @InterfaceC9871jM0(name = "index")
    public void setIndex(C1122Rq view, int index) {
        O90.m5968f(view, "view");
        view.setIndex(index);
    }
}
