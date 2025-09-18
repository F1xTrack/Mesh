package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC6467n5;
import p000.AbstractC6984v;
import p000.AbstractC7677Gz1;
import p000.AbstractC8765al1;
import p000.C1764b6;
import p000.C1826c6;
import p000.C3907d6;
import p000.C3969e6;
import p000.C4032f6;
import p000.C6455mu;
import p000.C6588oz;
import p000.InterfaceC7614Fu0;
import p000.RunnableC1192Sx;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T extends C4032f6> extends AbstractC8765al1 {

    /* renamed from: c */
    public RunnableC1192Sx f18053c;

    /* renamed from: d */
    public OverScroller f18054d;

    /* renamed from: e */
    public boolean f18055e;

    /* renamed from: f */
    public int f18056f;

    /* renamed from: g */
    public int f18057g;

    /* renamed from: h */
    public int f18058h;

    /* renamed from: i */
    public VelocityTracker f18059i;

    /* renamed from: j */
    public int f18060j;

    /* renamed from: k */
    public int f18061k;

    /* renamed from: l */
    public ValueAnimator f18062l;

    /* renamed from: m */
    public C3907d6 f18063m;

    /* renamed from: n */
    public WeakReference f18064n;

    public AppBarLayout$BaseBehavior() {
        this.f18056f = -1;
        this.f18058h = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m11162D(androidx.coordinatorlayout.widget.CoordinatorLayout r8, p000.C4032f6 r9, int r10, int r11, boolean r12) {
        /*
            r0 = 1
            int r1 = java.lang.Math.abs(r10)
            int r2 = r9.getChildCount()
            r3 = 0
            r4 = r3
        Lb:
            r5 = 0
            if (r4 >= r2) goto L21
            android.view.View r6 = r9.getChildAt(r4)
            int r7 = r6.getTop()
            if (r1 < r7) goto L1f
            int r7 = r6.getBottom()
            if (r1 > r7) goto L1f
            goto L22
        L1f:
            int r4 = r4 + r0
            goto Lb
        L21:
            r6 = r5
        L22:
            if (r6 == 0) goto L5d
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            e6 r1 = (p000.C3969e6) r1
            int r1 = r1.f26540a
            r2 = r1 & 1
            if (r2 == 0) goto L5d
            java.util.WeakHashMap r2 = p000.AbstractC10944rk1.f41842a
            int r2 = r6.getMinimumHeight()
            if (r11 <= 0) goto L4b
            r11 = r1 & 12
            if (r11 == 0) goto L4b
            int r10 = -r10
            int r11 = r6.getBottom()
            int r11 = r11 - r2
            int r1 = r9.getTopInset()
            int r11 = r11 - r1
            if (r10 < r11) goto L5d
        L49:
            r10 = r0
            goto L5e
        L4b:
            r11 = r1 & 2
            if (r11 == 0) goto L5d
            int r10 = -r10
            int r11 = r6.getBottom()
            int r11 = r11 - r2
            int r1 = r9.getTopInset()
            int r11 = r11 - r1
            if (r10 < r11) goto L5d
            goto L49
        L5d:
            r10 = r3
        L5e:
            boolean r11 = r9.f27061k
            if (r11 == 0) goto L6a
            android.view.View r10 = m11164w(r8)
            boolean r10 = r9.m18185f(r10)
        L6a:
            boolean r10 = r9.m18184e(r10)
            if (r12 != 0) goto Lad
            if (r10 == 0) goto Ld4
            Oo1 r8 = r8.f16072b
            java.lang.Object r8 = r8.f8628b
            L01 r8 = (p000.L01) r8
            java.lang.Object r8 = r8.getOrDefault(r9, r5)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 != 0) goto L81
            goto L86
        L81:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r8)
        L86:
            if (r5 != 0) goto L8c
            java.util.List r5 = java.util.Collections.emptyList()
        L8c:
            int r8 = r5.size()
        L90:
            if (r3 >= r8) goto Ld4
            java.lang.Object r10 = r5.get(r3)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            oz r10 = (p000.C6588oz) r10
            lz r10 = r10.f39405a
            boolean r11 = r10 instanceof com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            if (r11 == 0) goto Lab
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior) r10
            int r8 = r10.f18068f
            if (r8 == 0) goto Ld4
            goto Lad
        Lab:
            int r3 = r3 + r0
            goto L90
        Lad:
            android.graphics.drawable.Drawable r8 = r9.getBackground()
            if (r8 == 0) goto Lba
            android.graphics.drawable.Drawable r8 = r9.getBackground()
            r8.jumpToCurrentState()
        Lba:
            android.graphics.drawable.Drawable r8 = r9.getForeground()
            if (r8 == 0) goto Lc7
            android.graphics.drawable.Drawable r8 = r9.getForeground()
            r8.jumpToCurrentState()
        Lc7:
            android.animation.StateListAnimator r8 = r9.getStateListAnimator()
            if (r8 == 0) goto Ld4
            android.animation.StateListAnimator r8 = r9.getStateListAnimator()
            r8.jumpToCurrentState()
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.m11162D(androidx.coordinatorlayout.widget.CoordinatorLayout, f6, int, int, boolean):void");
    }

    /* renamed from: u */
    public static View m11163u(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, CoordinatorLayout coordinatorLayout) {
        appBarLayout$BaseBehavior.getClass();
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (((C6588oz) childAt.getLayoutParams()).f39405a instanceof AppBarLayout$ScrollingViewBehavior) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: w */
    public static View m11164w(CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if ((childAt instanceof InterfaceC7614Fu0) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019d  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m11165A(androidx.coordinatorlayout.widget.CoordinatorLayout r20, android.view.View r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.m11165A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
    }

    /* renamed from: B */
    public final void m11166B(CoordinatorLayout coordinatorLayout, View view, int i) {
        m11165A(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: C */
    public final void m11167C(CoordinatorLayout coordinatorLayout, C4032f6 c4032f6) {
        int paddingTop = c4032f6.getPaddingTop() + c4032f6.getTopInset();
        int iM11178x = m11178x() - paddingTop;
        int childCount = c4032f6.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                i = -1;
                break;
            }
            View childAt = c4032f6.getChildAt(i);
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            C3969e6 c3969e6 = (C3969e6) childAt.getLayoutParams();
            if ((c3969e6.f26540a & 32) == 32) {
                top -= ((LinearLayout.LayoutParams) c3969e6).topMargin;
                bottom += ((LinearLayout.LayoutParams) c3969e6).bottomMargin;
            }
            int i2 = -iM11178x;
            if (top <= i2 && bottom >= i2) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            View childAt2 = c4032f6.getChildAt(i);
            C3969e6 c3969e62 = (C3969e6) childAt2.getLayoutParams();
            int i3 = c3969e62.f26540a;
            if ((i3 & 17) == 17) {
                int topInset = -childAt2.getTop();
                int minimumHeight = -childAt2.getBottom();
                if (i == 0) {
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    if (c4032f6.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= c4032f6.getTopInset();
                    }
                }
                if ((i3 & 2) == 2) {
                    WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                    minimumHeight += childAt2.getMinimumHeight();
                } else if ((i3 & 5) == 5) {
                    WeakHashMap weakHashMap3 = AbstractC10944rk1.f41842a;
                    int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                    if (iM11178x < minimumHeight2) {
                        topInset = minimumHeight2;
                    } else {
                        minimumHeight = minimumHeight2;
                    }
                }
                if ((i3 & 32) == 32) {
                    topInset += ((LinearLayout.LayoutParams) c3969e62).topMargin;
                    minimumHeight -= ((LinearLayout.LayoutParams) c3969e62).bottomMargin;
                }
                if (iM11178x < (minimumHeight + topInset) / 2) {
                    topInset = minimumHeight;
                }
                m11177v(coordinatorLayout, c4032f6, AbstractC7677Gz1.m3204a(topInset + paddingTop, -c4032f6.getTotalScrollRange(), 0));
            }
        }
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: g */
    public final boolean mo11168g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int iFindPointerIndex;
        if (this.f18058h < 0) {
            this.f18058h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f18055e) {
            int i = this.f18056f;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f18057g) > this.f18058h) {
                this.f18057g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f18056f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            WeakReference weakReference = this.f18064n;
            boolean z = (weakReference == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.m9968n(view, x, y2);
            this.f18055e = z;
            if (z) {
                this.f18057g = y2;
                this.f18056f = motionEvent.getPointerId(0);
                if (this.f18059i == null) {
                    this.f18059i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f18054d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f18054d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f18059i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    @Override // p000.AbstractC8765al1, p000.AbstractC6397lz
    /* renamed from: h */
    public final boolean mo9810h(CoordinatorLayout coordinatorLayout, View view, int i) {
        int iRound;
        C4032f6 c4032f6 = (C4032f6) view;
        super.mo9810h(coordinatorLayout, c4032f6, i);
        int pendingAction = c4032f6.getPendingAction();
        C3907d6 c3907d6 = this.f18063m;
        if (c3907d6 == null || (pendingAction & 8) != 0) {
            if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i2 = -c4032f6.getUpNestedPreScrollRange();
                    if (z) {
                        m11177v(coordinatorLayout, c4032f6, i2);
                    } else {
                        m11166B(coordinatorLayout, c4032f6, i2);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m11177v(coordinatorLayout, c4032f6, 0);
                    } else {
                        m11166B(coordinatorLayout, c4032f6, 0);
                    }
                }
            }
        } else if (c3907d6.f25810c) {
            m11166B(coordinatorLayout, c4032f6, -c4032f6.getTotalScrollRange());
        } else if (c3907d6.f25811d) {
            m11166B(coordinatorLayout, c4032f6, 0);
        } else {
            View childAt = c4032f6.getChildAt(c3907d6.f25812e);
            int i3 = -childAt.getBottom();
            if (this.f18063m.f25814g) {
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                iRound = c4032f6.getTopInset() + childAt.getMinimumHeight() + i3;
            } else {
                iRound = Math.round(childAt.getHeight() * this.f18063m.f25813f) + i3;
            }
            m11166B(coordinatorLayout, c4032f6, iRound);
        }
        c4032f6.f27056f = 0;
        this.f18063m = null;
        int iM3204a = AbstractC7677Gz1.m3204a(m9811s(), -c4032f6.getTotalScrollRange(), 0);
        C6455mu c6455mu = this.f15685a;
        if (c6455mu == null) {
            this.f15686b = iM3204a;
        } else if (c6455mu.f37983c != iM3204a) {
            c6455mu.f37983c = iM3204a;
            c6455mu.m22991a();
        }
        m11162D(coordinatorLayout, c4032f6, m9811s(), 0, true);
        c4032f6.f27051a = m9811s();
        if (!c4032f6.willNotDraw()) {
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            c4032f6.postInvalidateOnAnimation();
        }
        if (AbstractC10944rk1.m24472d(coordinatorLayout) == null) {
            AbstractC10944rk1.m24482n(coordinatorLayout, new C1826c6(c4032f6, coordinatorLayout, this));
        }
        return true;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: i */
    public final boolean mo11169i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        C4032f6 c4032f6 = (C4032f6) view;
        if (((ViewGroup.MarginLayoutParams) ((C6588oz) c4032f6.getLayoutParams())).height != -2) {
            return false;
        }
        coordinatorLayout.m9971q(c4032f6, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
        return true;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo11170k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        m11179y(coordinatorLayout, (C4032f6) view, view2, i2, iArr);
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: l */
    public final void mo11171l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        C4032f6 c4032f6 = (C4032f6) view;
        if (i3 < 0) {
            iArr[1] = m11165A(coordinatorLayout, c4032f6, m11178x() - i3, -c4032f6.getDownNestedScrollRange(), 0);
        }
        if (i3 == 0 && AbstractC10944rk1.m24472d(coordinatorLayout) == null) {
            AbstractC10944rk1.m24482n(coordinatorLayout, new C1826c6(c4032f6, coordinatorLayout, this));
        }
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: n */
    public final void mo11172n(View view, Parcelable parcelable) {
        if (parcelable instanceof C3907d6) {
            this.f18063m = (C3907d6) parcelable;
        } else {
            this.f18063m = null;
        }
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: o */
    public final Parcelable mo11173o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        C3907d6 c3907d6M11180z = m11180z(absSavedState, (C4032f6) view);
        return c3907d6M11180z == null ? absSavedState : c3907d6M11180z;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: p */
    public final boolean mo11174p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        ValueAnimator valueAnimator;
        C4032f6 c4032f6 = (C4032f6) view;
        boolean z = (i & 2) != 0 && (c4032f6.f27061k || (c4032f6.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= c4032f6.getHeight()));
        if (z && (valueAnimator = this.f18062l) != null) {
            valueAnimator.cancel();
        }
        this.f18064n = null;
        this.f18061k = i2;
        return z;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: q */
    public final void mo11175q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        C4032f6 c4032f6 = (C4032f6) view;
        if (this.f18061k == 0 || i == 1) {
            m11167C(coordinatorLayout, c4032f6);
            if (c4032f6.f27061k) {
                c4032f6.m18184e(c4032f6.m18185f(view2));
            }
        }
        this.f18064n = new WeakReference(view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // p000.AbstractC6397lz
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo11176r(androidx.coordinatorlayout.widget.CoordinatorLayout r23, android.view.View r24, android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.mo11176r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: v */
    public final void m11177v(CoordinatorLayout coordinatorLayout, C4032f6 c4032f6, int i) {
        int iAbs = Math.abs(m11178x() - i);
        float fAbs = Math.abs(0.0f);
        int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / c4032f6.getHeight()) + 1.0f) * 150.0f);
        int iM11178x = m11178x();
        if (iM11178x == i) {
            ValueAnimator valueAnimator = this.f18062l;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f18062l.cancel();
            return;
        }
        ValueAnimator valueAnimator2 = this.f18062l;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.f18062l = valueAnimator3;
            valueAnimator3.setInterpolator(AbstractC6467n5.f38094e);
            this.f18062l.addUpdateListener(new C1764b6(c4032f6, coordinatorLayout, this));
        } else {
            valueAnimator2.cancel();
        }
        this.f18062l.setDuration(Math.min(iRound, 600));
        this.f18062l.setIntValues(iM11178x, i);
        this.f18062l.start();
    }

    /* renamed from: x */
    public final int m11178x() {
        return m9811s() + this.f18060j;
    }

    /* renamed from: y */
    public final void m11179y(CoordinatorLayout coordinatorLayout, C4032f6 c4032f6, View view, int i, int[] iArr) {
        int i2;
        int downNestedPreScrollRange;
        if (i != 0) {
            if (i < 0) {
                i2 = -c4032f6.getTotalScrollRange();
                downNestedPreScrollRange = c4032f6.getDownNestedPreScrollRange() + i2;
            } else {
                i2 = -c4032f6.getUpNestedPreScrollRange();
                downNestedPreScrollRange = 0;
            }
            int i3 = i2;
            int i4 = downNestedPreScrollRange;
            if (i3 != i4) {
                iArr[1] = m11165A(coordinatorLayout, c4032f6, m11178x() - i, i3, i4);
            }
        }
        if (c4032f6.f27061k) {
            c4032f6.m18184e(c4032f6.m18185f(view));
        }
    }

    /* renamed from: z */
    public final C3907d6 m11180z(Parcelable parcelable, C4032f6 c4032f6) {
        int iM9811s = m9811s();
        int childCount = c4032f6.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c4032f6.getChildAt(i);
            int bottom = childAt.getBottom() + iM9811s;
            if (childAt.getTop() + iM9811s <= 0 && bottom >= 0) {
                if (parcelable == null) {
                    parcelable = AbstractC6984v.f44063b;
                }
                C3907d6 c3907d6 = new C3907d6(parcelable);
                boolean z = iM9811s == 0;
                c3907d6.f25811d = z;
                c3907d6.f25810c = !z && (-iM9811s) >= c4032f6.getTotalScrollRange();
                c3907d6.f25812e = i;
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                c3907d6.f25814g = bottom == c4032f6.getTopInset() + childAt.getMinimumHeight();
                c3907d6.f25813f = bottom / childAt.getHeight();
                return c3907d6;
            }
        }
        return null;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f18056f = -1;
        this.f18058h = -1;
    }
}
