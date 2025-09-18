package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: u32 */
/* loaded from: classes.dex */
public abstract class AbstractC7341u32 {
    public static AV1 a = null;
    public static boolean b = false;
    public static Method c = null;
    public static boolean d = false;
    public static Field e;

    public static boolean a(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C6707qk1.d;
        C6707qk1 c6707qk1 = (C6707qk1) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c6707qk1 == null) {
            c6707qk1 = new C6707qk1();
            c6707qk1.a = null;
            c6707qk1.b = null;
            c6707qk1.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c6707qk1);
        }
        WeakReference weakReference2 = c6707qk1.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c6707qk1.c = new WeakReference(keyEvent);
        if (c6707qk1.b == null) {
            c6707qk1.b = new SparseArray();
        }
        SparseArray sparseArray = c6707qk1.b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean b(InterfaceC0816Kf0 interfaceC0816Kf0, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0816Kf0 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0816Kf0.superDispatchKeyEvent(keyEvent);
        }
        if (!(callback instanceof Activity)) {
            if (!(callback instanceof Dialog)) {
                return (view != null && AbstractC6897rk1.b(view, keyEvent)) || interfaceC0816Kf0.superDispatchKeyEvent(keyEvent);
            }
            Dialog dialog = (Dialog) callback;
            if (!d) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                d = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused2) {
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (AbstractC6897rk1.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        Activity activity = (Activity) callback;
        activity.onUserInteraction();
        Window window2 = activity.getWindow();
        if (window2.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!b) {
                    try {
                        c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused3) {
                    }
                    b = true;
                }
                Method method = c;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, keyEvent);
                        if (objInvoke != null) {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (AbstractC6897rk1.b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView2 != null ? decorView2.getKeyDispatcherState() : null, activity);
    }

    public static synchronized C5814m32 c(C4274i32 c4274i32) {
        try {
            if (a == null) {
                a = new AV1(2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C5814m32) a.g1(c4274i32);
    }
}
