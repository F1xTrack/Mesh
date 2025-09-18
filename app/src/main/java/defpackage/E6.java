package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes.dex */
public abstract class E6 {
    public Object a;
    public Object b;

    public /* synthetic */ E6(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public void c() {
        D6 d6 = (D6) this.a;
        if (d6 != null) {
            try {
                ((H6) this.b).k.unregisterReceiver(d6);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC8301z61)) {
            return menuItem;
        }
        InterfaceMenuItemC8301z61 interfaceMenuItemC8301z61 = (InterfaceMenuItemC8301z61) menuItem;
        if (((L01) this.b) == null) {
            this.b = new L01();
        }
        MenuItem menuItem2 = (MenuItem) ((L01) this.b).getOrDefault(interfaceMenuItemC8301z61, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1160Oq0 menuItemC1160Oq0 = new MenuItemC1160Oq0((Context) this.a, interfaceMenuItemC8301z61);
        ((L01) this.b).put(interfaceMenuItemC8301z61, menuItemC1160Oq0);
        return menuItemC1160Oq0;
    }

    public abstract void g();

    public void h() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((D6) this.a) == null) {
            this.a = new D6(0, this);
        }
        ((H6) this.b).k.registerReceiver((D6) this.a, intentFilterD);
    }

    public E6(ReactApplicationContext reactApplicationContext, String str) {
        this.b = reactApplicationContext;
        this.a = new W81(AbstractC8235ym.k("Universal", str, "Module"));
    }

    public E6(Context context) {
        this.a = context;
    }

    public E6(H6 h6) {
        this.b = h6;
    }
}
