package p000;

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
public abstract class AbstractC11242u32 {

    /* renamed from: a */
    public static AV1 f43477a = null;

    /* renamed from: b */
    public static boolean f43478b = false;

    /* renamed from: c */
    public static Method f43479c = null;

    /* renamed from: d */
    public static boolean f43480d = false;

    /* renamed from: e */
    public static Field f43481e;

    /* renamed from: a */
    public static boolean m25098a(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C10816qk1.f41123d;
        C10816qk1 c10816qk1 = (C10816qk1) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c10816qk1 == null) {
            c10816qk1 = new C10816qk1();
            c10816qk1.f41124a = null;
            c10816qk1.f41125b = null;
            c10816qk1.f41126c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c10816qk1);
        }
        WeakReference weakReference2 = c10816qk1.f41126c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c10816qk1.f41126c = new WeakReference(keyEvent);
        if (c10816qk1.f41125b == null) {
            c10816qk1.f41125b = new SparseArray();
        }
        SparseArray sparseArray = c10816qk1.f41125b;
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

    /* renamed from: b */
    public static boolean m25099b(InterfaceC7844Kf0 interfaceC7844Kf0, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC7844Kf0 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC7844Kf0.superDispatchKeyEvent(keyEvent);
        }
        if (!(callback instanceof Activity)) {
            if (!(callback instanceof Dialog)) {
                return (view != null && AbstractC10944rk1.m24470b(view, keyEvent)) || interfaceC7844Kf0.superDispatchKeyEvent(keyEvent);
            }
            Dialog dialog = (Dialog) callback;
            if (!f43480d) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    f43481e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f43480d = true;
            }
            Field field = f43481e;
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
            if (AbstractC10944rk1.m24470b(decorView, keyEvent)) {
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
                if (!f43478b) {
                    try {
                        f43479c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused3) {
                    }
                    f43478b = true;
                }
                Method method = f43479c;
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
        if (AbstractC10944rk1.m24470b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView2 != null ? decorView2.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    public static synchronized C10218m32 m25100c(C9706i32 c9706i32) {
        try {
            if (f43477a == null) {
                f43477a = new AV1(2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C10218m32) f43477a.m7838g1(c9706i32);
    }
}
