package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.AbstractC9125dX0;
import p000.AbstractC9893jX0;
import p000.C10910rT1;
import p000.C6279k6;
import p000.RunnableC10431nk0;

/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends C6279k6 {

    /* renamed from: e */
    public int f15865e;

    /* renamed from: f */
    public AbstractC9893jX0 f15866f;

    /* renamed from: g */
    public boolean f15867g;

    /* renamed from: h */
    public final RunnableC10431nk0 f15868h;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15868h = new RunnableC10431nk0(5, this);
        this.f15865e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i < 600) {
            return (i < 640 || i2 < 480) ? 160 : 192;
        }
        return 192;
    }

    /* renamed from: a */
    public final void m9848a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC9125dX0.m17704b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
                return;
            }
            return;
        }
        C10910rT1 c10910rT1 = AbstractC9893jX0.f35175u1;
        c10910rT1.getClass();
        C10910rT1.m24363E();
        Method method = (Method) c10910rT1.f41680d;
        if (method != null) {
            try {
                method.invoke(this, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f15865e <= 0 || super.enoughToFilter();
    }

    @Override // p000.C6279k6, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f15867g) {
            RunnableC10431nk0 runnableC10431nk0 = this.f15868h;
            removeCallbacks(runnableC10431nk0);
            post(runnableC10431nk0);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onFocusChanged(z, i, rect);
        AbstractC9893jX0 abstractC9893jX0 = this.f15866f;
        abstractC9893jX0.m22068z(abstractC9893jX0.f35191P);
        abstractC9893jX0.post(abstractC9893jX0.f35208r1);
        if (abstractC9893jX0.f35204p.hasFocus()) {
            abstractC9893jX0.m22056n();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.f15866f.clearFocus();
                    setImeVisibility(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onWindowFocusChanged(z);
        if (z && this.f15866f.hasFocus() && getVisibility() == 0) {
            this.f15867g = true;
            Context context = getContext();
            C10910rT1 c10910rT1 = AbstractC9893jX0.f35175u1;
            if (context.getResources().getConfiguration().orientation == 2) {
                m9848a();
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        RunnableC10431nk0 runnableC10431nk0 = this.f15868h;
        if (!z) {
            this.f15867g = false;
            removeCallbacks(runnableC10431nk0);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f15867g = true;
                return;
            }
            this.f15867g = false;
            removeCallbacks(runnableC10431nk0);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(AbstractC9893jX0 abstractC9893jX0) {
        this.f15866f = abstractC9893jX0;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.f15865e = i;
    }
}
