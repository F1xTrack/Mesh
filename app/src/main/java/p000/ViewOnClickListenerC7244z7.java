package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: z7 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC7244z7 implements View.OnClickListener {

    /* renamed from: a */
    public final View f46636a;

    /* renamed from: b */
    public final String f46637b;

    /* renamed from: c */
    public Method f46638c;

    /* renamed from: d */
    public Context f46639d;

    public ViewOnClickListenerC7244z7(View view, String str) {
        this.f46636a = view;
        this.f46637b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f46638c == null) {
            View view2 = this.f46636a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f46637b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbM26240q = AbstractC7222ym.m26240q("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbM26240q.append(view2.getClass());
                    sbM26240q.append(str);
                    throw new IllegalStateException(sbM26240q.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f46638c = method;
                        this.f46639d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f46638c.invoke(this.f46639d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
