package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import p000.AbstractC10554oh1;
import p000.AbstractC10944rk1;
import p000.C0197D7;
import p000.C4218i3;
import p000.C7258zL;
import p000.C8286Ss0;
import p000.C8664Zz0;
import p000.C9315f11;
import p000.C9927jo0;
import p000.S02;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final Calendar f18197a;

    /* renamed from: b */
    public final boolean f18198b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f18197a = AbstractC10554oh1.m23526g(null);
        if (C9927jo0.m22103v(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(ru.mes.dnevnik.R.id.cancel_button);
            setNextFocusRightId(ru.mes.dnevnik.R.id.confirm_button);
        }
        this.f18198b = C9927jo0.m22103v(getContext(), ru.mes.dnevnik.R.attr.nestedScrollable);
        AbstractC10944rk1.m24482n(this, new C7258zL(3));
    }

    /* renamed from: a */
    public final C1940a m11239a() {
        return (C1940a) super.getAdapter();
    }

    /* renamed from: b */
    public final View m11240b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C1940a) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C1940a) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iM11241a;
        int width;
        int iM11241a2;
        int width2;
        int i;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C1940a c1940a = (C1940a) super.getAdapter();
        C9315f11 c9315f11 = c1940a.f18202b;
        C0197D7 c0197d7 = c1940a.f18204d;
        int iMax = Math.max(c1940a.m11241a(), getFirstVisiblePosition());
        int iMin = Math.min(c1940a.m11243c(), getLastVisiblePosition());
        Long item = c1940a.getItem(iMax);
        Long item2 = c1940a.getItem(iMin);
        c9315f11.getClass();
        Iterator it = new ArrayList().iterator();
        while (it.hasNext()) {
            C8664Zz0 c8664Zz0 = (C8664Zz0) it.next();
            Object obj = c8664Zz0.f15267a;
            if (obj != null) {
                Object obj2 = c8664Zz0.f15268b;
                if (obj2 != null) {
                    Long l = (Long) obj;
                    long jLongValue = l.longValue();
                    Long l2 = (Long) obj2;
                    long jLongValue2 = l2.longValue();
                    if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                        materialCalendarGridView = this;
                        iMax = iMax;
                        c1940a = c1940a;
                        it = it;
                    } else {
                        boolean zM7146b = S02.m7146b(this);
                        long jLongValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f18197a;
                        C8286Ss0 c8286Ss0 = c1940a.f18201a;
                        if (jLongValue < jLongValue3) {
                            width = iMax % c8286Ss0.f11019d == 0 ? 0 : !zM7146b ? materialCalendarGridView.m11240b(iMax - 1).getRight() : materialCalendarGridView.m11240b(iMax - 1).getLeft();
                            iM11241a = iMax;
                        } else {
                            calendar.setTimeInMillis(jLongValue);
                            iM11241a = c1940a.m11241a() + (calendar.get(5) - 1);
                            View viewM11240b = materialCalendarGridView.m11240b(iM11241a);
                            width = (viewM11240b.getWidth() / 2) + viewM11240b.getLeft();
                        }
                        if (jLongValue2 > item2.longValue()) {
                            width2 = (iMin + 1) % c8286Ss0.f11019d == 0 ? getWidth() : !zM7146b ? materialCalendarGridView.m11240b(iMin).getRight() : materialCalendarGridView.m11240b(iMin).getLeft();
                            iM11241a2 = iMin;
                        } else {
                            calendar.setTimeInMillis(jLongValue2);
                            iM11241a2 = c1940a.m11241a() + (calendar.get(5) - 1);
                            View viewM11240b2 = materialCalendarGridView.m11240b(iM11241a2);
                            width2 = (viewM11240b2.getWidth() / 2) + viewM11240b2.getLeft();
                        }
                        int itemId = (int) c1940a.getItemId(iM11241a);
                        int itemId2 = (int) c1940a.getItemId(iM11241a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            C1940a c1940a2 = c1940a;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View viewM11240b3 = materialCalendarGridView.m11240b(numColumns);
                            int top = viewM11240b3.getTop() + ((Rect) ((C4218i3) c0197d7.f1847b).f28782b).top;
                            Iterator it2 = it;
                            int bottom = viewM11240b3.getBottom() - ((Rect) ((C4218i3) c0197d7.f1847b).f28782b).bottom;
                            if (zM7146b) {
                                int i2 = iM11241a2 > numColumns2 ? 0 : width2;
                                int width4 = numColumns > iM11241a ? getWidth() : width;
                                i = i2;
                                width3 = width4;
                            } else {
                                i = numColumns > iM11241a ? 0 : width;
                                width3 = iM11241a2 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i, top, width3, bottom, (Paint) c0197d7.f1853h);
                            itemId++;
                            materialCalendarGridView = this;
                            iMax = iMax;
                            c1940a = c1940a2;
                            it = it2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((C1940a) super.getAdapter()).m11243c());
        } else if (i == 130) {
            setSelection(((C1940a) super.getAdapter()).m11241a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C1940a) super.getAdapter()).m11241a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C1940a) super.getAdapter()).m11241a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f18198b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C1940a) super.getAdapter()).m11241a()) {
            super.setSelection(((C1940a) super.getAdapter()).m11241a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C1940a) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C1940a)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C1940a.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
