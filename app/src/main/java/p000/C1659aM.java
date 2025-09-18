package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import ru.mes.dnevnik.R;

/* renamed from: aM */
/* loaded from: classes.dex */
public class C1659aM extends ListView {

    /* renamed from: a */
    public final Rect f15467a;

    /* renamed from: b */
    public int f15468b;

    /* renamed from: c */
    public int f15469c;

    /* renamed from: d */
    public int f15470d;

    /* renamed from: e */
    public int f15471e;

    /* renamed from: f */
    public int f15472f;

    /* renamed from: g */
    public C1532YL f15473g;

    /* renamed from: h */
    public boolean f15474h;

    /* renamed from: i */
    public final boolean f15475i;

    /* renamed from: j */
    public boolean f15476j;

    /* renamed from: k */
    public ViewOnTouchListenerC7748Ij0 f15477k;

    /* renamed from: l */
    public GR0 f15478l;

    public C1659aM(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f15467a = new Rect();
        this.f15468b = 0;
        this.f15469c = 0;
        this.f15470d = 0;
        this.f15471e = 0;
        this.f15475i = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final int m9714a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x017a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m9715b(android.view.MotionEvent r17, int r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1659aM.m9715b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f15467a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f15478l != null) {
            return;
        }
        super.drawableStateChanged();
        C1532YL c1532yl = this.f15473g;
        if (c1532yl != null) {
            c1532yl.f14264b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f15476j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f15475i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f15475i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f15475i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f15475i && this.f15474h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f15478l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f15478l == null) {
            GR0 gr0 = new GR0(16, this);
            this.f15478l = gr0;
            post(gr0);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !AbstractC1406WL.f13140d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC1406WL.f13137a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC1406WL.f13138b.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC1406WL.f13139c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f15476j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15472f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        GR0 gr0 = this.f15478l;
        if (gr0 != null) {
            C1659aM c1659aM = (C1659aM) gr0.f3738b;
            c1659aM.f15478l = null;
            c1659aM.removeCallbacks(gr0);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f15474h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1532YL c1532yl;
        if (drawable != null) {
            c1532yl = new C1532YL(drawable);
            c1532yl.f14264b = true;
        } else {
            c1532yl = null;
        }
        this.f15473g = c1532yl;
        super.setSelector(c1532yl);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f15468b = rect.left;
        this.f15469c = rect.top;
        this.f15470d = rect.right;
        this.f15471e = rect.bottom;
    }
}
