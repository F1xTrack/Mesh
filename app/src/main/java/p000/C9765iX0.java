package p000;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: iX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9765iX0 extends TouchDelegate {

    /* renamed from: a */
    public final View f29304a;

    /* renamed from: b */
    public final Rect f29305b;

    /* renamed from: c */
    public final Rect f29306c;

    /* renamed from: d */
    public final Rect f29307d;

    /* renamed from: e */
    public final int f29308e;

    /* renamed from: f */
    public boolean f29309f;

    public C9765iX0(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f29308e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f29305b = rect3;
        Rect rect4 = new Rect();
        this.f29307d = rect4;
        Rect rect5 = new Rect();
        this.f29306c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f29304a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f29309f;
                if (z2 && !this.f29307d.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.f29309f;
                    this.f29309f = false;
                }
                z = true;
                z3 = false;
            }
            z3 = z2;
            z = true;
        } else if (this.f29305b.contains(x, y)) {
            this.f29309f = true;
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        Rect rect = this.f29306c;
        View view = this.f29304a;
        if (!z || rect.contains(x, y)) {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
