package p000;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: AX */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0034AX implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f228a;

    /* renamed from: b */
    public final int f229b;

    /* renamed from: c */
    public final int f230c;

    /* renamed from: d */
    public final View f231d;

    /* renamed from: e */
    public RunnableC7270zX f232e;

    /* renamed from: f */
    public RunnableC7270zX f233f;

    /* renamed from: g */
    public boolean f234g;

    /* renamed from: h */
    public int f235h;

    /* renamed from: i */
    public final int[] f236i = new int[2];

    public AbstractViewOnTouchListenerC0034AX(View view) {
        this.f231d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f228a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f229b = tapTimeout;
        this.f230c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m199a() {
        RunnableC7270zX runnableC7270zX = this.f233f;
        View view = this.f231d;
        if (runnableC7270zX != null) {
            view.removeCallbacks(runnableC7270zX);
        }
        RunnableC7270zX runnableC7270zX2 = this.f232e;
        if (runnableC7270zX2 != null) {
            view.removeCallbacks(runnableC7270zX2);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC11742y01 mo200b();

    /* renamed from: c */
    public abstract boolean mo201c();

    /* renamed from: d */
    public boolean mo202d() {
        InterfaceC11742y01 interfaceC11742y01Mo200b = mo200b();
        if (interfaceC11742y01Mo200b == null || !interfaceC11742y01Mo200b.mo334a()) {
            return true;
        }
        interfaceC11742y01Mo200b.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractViewOnTouchListenerC0034AX.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f234g = false;
        this.f235h = -1;
        RunnableC7270zX runnableC7270zX = this.f232e;
        if (runnableC7270zX != null) {
            this.f231d.removeCallbacks(runnableC7270zX);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
