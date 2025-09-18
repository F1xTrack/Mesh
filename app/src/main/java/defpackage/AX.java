package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class AX implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public RunnableC8380zX e;
    public RunnableC8380zX f;
    public boolean g;
    public int h;
    public final int[] i = new int[2];

    public AX(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC8380zX runnableC8380zX = this.f;
        View view = this.d;
        if (runnableC8380zX != null) {
            view.removeCallbacks(runnableC8380zX);
        }
        RunnableC8380zX runnableC8380zX2 = this.e;
        if (runnableC8380zX2 != null) {
            view.removeCallbacks(runnableC8380zX2);
        }
    }

    public abstract InterfaceC8090y01 b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC8090y01 interfaceC8090y01B = b();
        if (interfaceC8090y01B == null || !interfaceC8090y01B.a()) {
            return true;
        }
        interfaceC8090y01B.dismiss();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AX.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.h = -1;
        RunnableC8380zX runnableC8380zX = this.e;
        if (runnableC8380zX != null) {
            this.d.removeCallbacks(runnableC8380zX);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
