package defpackage;

import android.app.Activity;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class LW implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ LW(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Activity currentActivity;
        Window window;
        View decorView;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                NW nw = (NW) obj;
                O90.f(nw, "this$0");
                View rootView = null;
                ViewOnLayoutChangeListenerC7486uq viewOnLayoutChangeListenerC7486uq = nw.i;
                if (view2 == null || view != null) {
                    EditText editText = nw.e;
                    if (editText != null) {
                        editText.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC7486uq);
                    }
                    EditText editText2 = nw.e;
                    if (editText2 != null) {
                        editText2.post(new RQ(editText2, 4, nw.g));
                    }
                    C3881g1 c3881g1 = nw.h;
                    if (c3881g1 != null) {
                        c3881g1.invoke();
                    }
                    nw.e = null;
                }
                if (view2 instanceof EditText) {
                    EditText editText3 = (EditText) view2;
                    nw.e = editText3;
                    view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC7486uq);
                    nw.b();
                    O90.f(editText3, "<this>");
                    C8277z c8277z = nw.j;
                    O90.f(c8277z, NotificationConstants.ACTION);
                    C3950gN c3950gN = new C3950gN(new TO0(), c8277z);
                    try {
                        Field declaredField = C3370dK0.class.getDeclaredField("m");
                        O90.e(declaredField, "getDeclaredField(...)");
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(editText3);
                        ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
                        if (arrayList != null) {
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (!(it.next() instanceof TextWatcher)) {
                                    }
                                }
                            }
                            arrayList.add(0, c3950gN);
                        }
                    } catch (ClassCastException e) {
                        O90.f("Can not attach listener because casting failed: " + e.getMessage(), "message");
                    } catch (IllegalArgumentException e2) {
                        O90.f("Can not attach listener to be the first in the list: " + e2.getMessage() + ". Attaching to the end...", "message");
                        editText3.addTextChangedListener(c3950gN);
                    } catch (NoSuchFieldException e3) {
                        O90.f("Can not attach listener because field `mListeners` not found: " + e3.getMessage(), "message");
                    }
                    nw.g = c3950gN;
                    MW mw = nw.k;
                    O90.f(mw, NotificationConstants.ACTION);
                    C3436dg0 c3436dg0 = new C3436dg0(editText3, mw);
                    editText3.getViewTreeObserver().addOnPreDrawListener(c3436dg0.f);
                    nw.h = new C3881g1(17, c3436dg0);
                    AbstractC6188o12.a = new WeakReference(editText3);
                    S91 s91 = nw.c;
                    if (s91 != null && (currentActivity = s91.getCurrentActivity()) != null && (window = currentActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        rootView = decorView.getRootView();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    I02.d(rootView, arrayList2);
                    int iIndexOf = arrayList2.indexOf(view2);
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putInt("current", iIndexOf);
                    writableMapCreateMap.putInt("count", arrayList2.size());
                    T91.b(s91, "KeyboardController::focusDidSet", writableMapCreateMap);
                }
                if (view2 == null) {
                    nw.a(AbstractC0565Gz1.a);
                    break;
                }
                break;
            default:
                C1595Uf0 c1595Uf0 = (C1595Uf0) obj;
                O90.f(c1595Uf0, "this$0");
                if (view2 instanceof EditText) {
                    c1595Uf0.k = ((EditText) view2).getId();
                    if (c1595Uf0.h && view != null) {
                        C3378dN c3378dN = c1595Uf0.a;
                        int id = c3378dN.getId();
                        C5739lg0 c5739lg0 = new C5739lg0(c1595Uf0.e, c3378dN.getId(), C5739lg0.g, c1595Uf0.f, 1.0d, 0, c1595Uf0.k);
                        S91 s912 = c1595Uf0.c;
                        T91.a(s912, id, c5739lg0);
                        T91.a(s912, c3378dN.getId(), new C5739lg0(c1595Uf0.e, c3378dN.getId(), C5739lg0.h, c1595Uf0.f, 1.0d, 0, c1595Uf0.k));
                        T91.b(s912, "KeyboardController::keyboardWillShow", c1595Uf0.b(c1595Uf0.f));
                        T91.b(s912, "KeyboardController::keyboardDidShow", c1595Uf0.b(c1595Uf0.f));
                        break;
                    }
                }
                break;
        }
    }
}
