package p000;

import android.app.Activity;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: LW */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalFocusChangeListenerC0725LW implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f6679a;

    /* renamed from: b */
    public final /* synthetic */ Object f6680b;

    public /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC0725LW(int i, Object obj) {
        this.f6679a = i;
        this.f6680b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Activity currentActivity;
        Window window;
        View decorView;
        Object obj = this.f6680b;
        switch (this.f6679a) {
            case 0:
                C0851NW c0851nw = (C0851NW) obj;
                O90.m5968f(c0851nw, "this$0");
                View rootView = null;
                ViewOnLayoutChangeListenerC6974uq viewOnLayoutChangeListenerC6974uq = c0851nw.f7851i;
                if (view2 == null || view != null) {
                    EditText editText = c0851nw.f7847e;
                    if (editText != null) {
                        editText.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC6974uq);
                    }
                    EditText editText2 = c0851nw.f7847e;
                    if (editText2 != null) {
                        editText2.post(new RunnableC1096RQ(editText2, 4, c0851nw.f7849g));
                    }
                    C4090g1 c4090g1 = c0851nw.f7850h;
                    if (c4090g1 != null) {
                        c4090g1.invoke();
                    }
                    c0851nw.f7847e = null;
                }
                if (view2 instanceof EditText) {
                    EditText editText3 = (EditText) view2;
                    c0851nw.f7847e = editText3;
                    view2.addOnLayoutChangeListener(viewOnLayoutChangeListenerC6974uq);
                    c0851nw.m5751b();
                    O90.m5968f(editText3, "<this>");
                    C7236z c7236z = c0851nw.f7852j;
                    O90.m5968f(c7236z, NotificationConstants.ACTION);
                    C4112gN c4112gN = new C4112gN(new TO0(), c7236z);
                    try {
                        Field declaredField = C9099dK0.class.getDeclaredField("m");
                        O90.m5967e(declaredField, "getDeclaredField(...)");
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
                            arrayList.add(0, c4112gN);
                        }
                    } catch (ClassCastException e) {
                        O90.m5968f("Can not attach listener because casting failed: " + e.getMessage(), "message");
                    } catch (IllegalArgumentException e2) {
                        O90.m5968f("Can not attach listener to be the first in the list: " + e2.getMessage() + ". Attaching to the end...", "message");
                        editText3.addTextChangedListener(c4112gN);
                    } catch (NoSuchFieldException e3) {
                        O90.m5968f("Can not attach listener because field `mListeners` not found: " + e3.getMessage(), "message");
                    }
                    c0851nw.f7849g = c4112gN;
                    C0788MW c0788mw = c0851nw.f7853k;
                    O90.m5968f(c0788mw, NotificationConstants.ACTION);
                    C9143dg0 c9143dg0 = new C9143dg0(editText3, c0788mw);
                    editText3.getViewTreeObserver().addOnPreDrawListener(c9143dg0.f26208f);
                    c0851nw.f7850h = new C4090g1(17, c9143dg0);
                    AbstractC10468o12.f38689a = new WeakReference(editText3);
                    S91 s91 = c0851nw.f7845c;
                    if (s91 != null && (currentActivity = s91.getCurrentActivity()) != null && (window = currentActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        rootView = decorView.getRootView();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    I02.m3690d(rootView, arrayList2);
                    int iIndexOf = arrayList2.indexOf(view2);
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putInt("current", iIndexOf);
                    writableMapCreateMap.putInt("count", arrayList2.size());
                    T91.m7609b(s91, "KeyboardController::focusDidSet", writableMapCreateMap);
                }
                if (view2 == null) {
                    c0851nw.m5750a(AbstractC7677Gz1.f3976a);
                    break;
                }
                break;
            default:
                C8364Uf0 c8364Uf0 = (C8364Uf0) obj;
                O90.m5968f(c8364Uf0, "this$0");
                if (view2 instanceof EditText) {
                    c8364Uf0.f11966k = ((EditText) view2).getId();
                    if (c8364Uf0.f11963h && view != null) {
                        C3924dN c3924dN = c8364Uf0.f11956a;
                        int id = c3924dN.getId();
                        C10167lg0 c10167lg0 = new C10167lg0(c8364Uf0.f11960e, c3924dN.getId(), C10167lg0.f37237g, c8364Uf0.f11961f, 1.0d, 0, c8364Uf0.f11966k);
                        S91 s912 = c8364Uf0.f11958c;
                        T91.m7608a(s912, id, c10167lg0);
                        T91.m7608a(s912, c3924dN.getId(), new C10167lg0(c8364Uf0.f11960e, c3924dN.getId(), C10167lg0.f37238h, c8364Uf0.f11961f, 1.0d, 0, c8364Uf0.f11966k));
                        T91.m7609b(s912, "KeyboardController::keyboardWillShow", c8364Uf0.m8110b(c8364Uf0.f11961f));
                        T91.m7609b(s912, "KeyboardController::keyboardDidShow", c8364Uf0.m8110b(c8364Uf0.f11961f));
                        break;
                    }
                }
                break;
        }
    }
}
