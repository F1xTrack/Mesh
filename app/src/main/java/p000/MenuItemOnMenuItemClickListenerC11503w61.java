package p000;

import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: w61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC11503w61 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public static final Class[] f44679d = {MenuItem.class};

    /* renamed from: a */
    public final /* synthetic */ int f44680a = 0;

    /* renamed from: b */
    public Object f44681b;

    /* renamed from: c */
    public Object f44682c;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC11503w61() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f44680a) {
            case 0:
                Method method = (Method) this.f44682c;
                try {
                    Class<?> returnType = method.getReturnType();
                    Class<?> cls = Boolean.TYPE;
                    Object obj = this.f44681b;
                    if (returnType == cls) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.f44681b).onMenuItemClick(((MenuItemC8074Oq0) this.f44682c).m2028f(menuItem));
        }
    }

    public MenuItemOnMenuItemClickListenerC11503w61(MenuItemC8074Oq0 menuItemC8074Oq0, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f44682c = menuItemC8074Oq0;
        this.f44681b = onMenuItemClickListener;
    }
}
