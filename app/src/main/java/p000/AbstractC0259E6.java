package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: E6 */
/* loaded from: classes.dex */
public abstract class AbstractC0259E6 {

    /* renamed from: a */
    public Object f2473a;

    /* renamed from: b */
    public Object f2474b;

    public /* synthetic */ AbstractC0259E6(Object obj, Object obj2) {
        this.f2473a = obj;
        this.f2474b = obj2;
    }

    /* renamed from: c */
    public void m2027c() {
        C0196D6 c0196d6 = (C0196D6) this.f2473a;
        if (c0196d6 != null) {
            try {
                ((LayoutInflaterFactory2C0448H6) this.f2474b).f4091k.unregisterReceiver(c0196d6);
            } catch (IllegalArgumentException unused) {
            }
            this.f2473a = null;
        }
    }

    /* renamed from: d */
    public abstract IntentFilter mo981d();

    /* renamed from: e */
    public abstract int mo982e();

    /* renamed from: f */
    public MenuItem m2028f(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC11884z61)) {
            return menuItem;
        }
        InterfaceMenuItemC11884z61 interfaceMenuItemC11884z61 = (InterfaceMenuItemC11884z61) menuItem;
        if (((L01) this.f2474b) == null) {
            this.f2474b = new L01();
        }
        MenuItem menuItem2 = (MenuItem) ((L01) this.f2474b).getOrDefault(interfaceMenuItemC11884z61, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC8074Oq0 menuItemC8074Oq0 = new MenuItemC8074Oq0((Context) this.f2473a, interfaceMenuItemC11884z61);
        ((L01) this.f2474b).put(interfaceMenuItemC11884z61, menuItemC8074Oq0);
        return menuItemC8074Oq0;
    }

    /* renamed from: g */
    public abstract void mo983g();

    /* renamed from: h */
    public void m2029h() {
        m2027c();
        IntentFilter intentFilterMo981d = mo981d();
        if (intentFilterMo981d.countActions() == 0) {
            return;
        }
        if (((C0196D6) this.f2473a) == null) {
            this.f2473a = new C0196D6(0, this);
        }
        ((LayoutInflaterFactory2C0448H6) this.f2474b).f4091k.registerReceiver((C0196D6) this.f2473a, intentFilterMo981d);
    }

    public AbstractC0259E6(ReactApplicationContext reactApplicationContext, String str) {
        this.f2474b = reactApplicationContext;
        this.f2473a = new W81(AbstractC7222ym.m26234k("Universal", str, "Module"));
    }

    public AbstractC0259E6(Context context) {
        this.f2473a = context;
    }

    public AbstractC0259E6(LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6) {
        this.f2474b = layoutInflaterFactory2C0448H6;
    }
}
