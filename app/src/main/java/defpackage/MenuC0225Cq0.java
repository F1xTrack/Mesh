package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: Cq0 */
/* loaded from: classes.dex */
public class MenuC0225Cq0 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public InterfaceC0069Aq0 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public C0849Kq0 v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public MenuC0225Cq0(Context context) {
        boolean zB;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC7661vk1.a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = AbstractC7279tk1.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", ConstantDeviceInfo.APP_PLATFORM);
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z = true;
            }
        }
        this.d = z;
    }

    public final C0849Kq0 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        C0849Kq0 c0849Kq0 = new C0849Kq0(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0849Kq0) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0849Kq0);
        p(true);
        return c0849Kq0;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0849Kq0 c0849Kq0A = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c0849Kq0A.setIcon(resolveInfo.loadIcon(packageManager));
            c0849Kq0A.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c0849Kq0A;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC1862Xq0 interfaceC1862Xq0, Context context) {
        this.u.add(new WeakReference(interfaceC1862Xq0));
        interfaceC1862Xq0.k(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1862Xq0 interfaceC1862Xq0 = (InterfaceC1862Xq0) weakReference.get();
            if (interfaceC1862Xq0 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1862Xq0.f(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0849Kq0 c0849Kq0 = this.v;
        if (c0849Kq0 != null) {
            d(c0849Kq0);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0849Kq0 c0849Kq0) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == c0849Kq0) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1862Xq0 interfaceC1862Xq0 = (InterfaceC1862Xq0) weakReference.get();
                if (interfaceC1862Xq0 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE = interfaceC1862Xq0.e(c0849Kq0);
                    if (zE) {
                        break;
                    }
                }
            }
            v();
            if (zE) {
                this.v = null;
            }
        }
        return zE;
    }

    public boolean e(MenuC0225Cq0 menuC0225Cq0, MenuItem menuItem) {
        InterfaceC0069Aq0 interfaceC0069Aq0 = this.e;
        return interfaceC0069Aq0 != null && interfaceC0069Aq0.g(menuC0225Cq0, menuItem);
    }

    public boolean f(C0849Kq0 c0849Kq0) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1862Xq0 interfaceC1862Xq0 = (InterfaceC1862Xq0) weakReference.get();
            if (interfaceC1862Xq0 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zH = interfaceC1862Xq0.h(c0849Kq0);
                if (zH) {
                    break;
                }
            }
        }
        v();
        if (zH) {
            this.v = c0849Kq0;
        }
        return zH;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0849Kq0 c0849Kq0 = (C0849Kq0) arrayList.get(i2);
            if (c0849Kq0.a == i) {
                return c0849Kq0;
            }
            if (c0849Kq0.hasSubMenu() && (menuItemFindItem = c0849Kq0.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final C0849Kq0 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0849Kq0) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0849Kq0 c0849Kq0 = (C0849Kq0) arrayList.get(i2);
            char c = zN ? c0849Kq0.j : c0849Kq0.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return c0849Kq0;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.ArrayList r17, int r18, android.view.KeyEvent r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r16.n()
            int r4 = r19.getModifiers()
            android.view.KeyCharacterMap$KeyData r5 = new android.view.KeyCharacterMap$KeyData
            r5.<init>()
            boolean r6 = r2.getKeyData(r5)
            r7 = 67
            if (r6 != 0) goto L1e
            if (r1 == r7) goto L1e
            return
        L1e:
            r6 = r16
            java.util.ArrayList r8 = r6.f
            int r9 = r8.size()
            r10 = 0
            r11 = r10
        L28:
            if (r11 >= r9) goto L7a
            java.lang.Object r12 = r8.get(r11)
            Kq0 r12 = (defpackage.C0849Kq0) r12
            boolean r13 = r12.hasSubMenu()
            if (r13 == 0) goto L3b
            I51 r13 = r12.o
            r13.h(r0, r1, r2)
        L3b:
            if (r3 == 0) goto L40
            char r13 = r12.j
            goto L42
        L40:
            char r13 = r12.h
        L42:
            if (r3 == 0) goto L47
            int r14 = r12.k
            goto L49
        L47:
            int r14 = r12.i
        L49:
            r15 = 69647(0x1100f, float:9.7596E-41)
            r7 = r4 & r15
            r14 = r14 & r15
            if (r7 != r14) goto L69
            if (r13 == 0) goto L69
            char[] r7 = r5.meta
            char r14 = r7[r10]
            if (r13 == r14) goto L6c
            r14 = 2
            char r7 = r7[r14]
            if (r13 == r7) goto L6c
            if (r3 == 0) goto L69
            r7 = 8
            if (r13 != r7) goto L69
            r7 = 67
            if (r1 != r7) goto L77
            goto L6e
        L69:
            r7 = 67
            goto L77
        L6c:
            r7 = 67
        L6e:
            boolean r13 = r12.isEnabled()
            if (r13 == 0) goto L77
            r0.add(r12)
        L77:
            int r11 = r11 + 1
            goto L28
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MenuC0225Cq0.h(java.util.ArrayList, int, android.view.KeyEvent):void");
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0849Kq0) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zD = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1862Xq0 interfaceC1862Xq0 = (InterfaceC1862Xq0) weakReference.get();
                if (interfaceC1862Xq0 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= interfaceC1862Xq0.d();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    C0849Kq0 c0849Kq0 = (C0849Kq0) arrayListL.get(i);
                    if (c0849Kq0.f()) {
                        arrayList.add(c0849Kq0);
                    } else {
                        arrayList2.add(c0849Kq0);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0849Kq0 c0849Kq0 = (C0849Kq0) arrayList2.get(i);
            if (c0849Kq0.isVisible()) {
                arrayList.add(c0849Kq0);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1862Xq0 interfaceC1862Xq0 = (InterfaceC1862Xq0) weakReference.get();
            if (interfaceC1862Xq0 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1862Xq0.i();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0849Kq0 c0849Kq0G = g(i, keyEvent);
        boolean zQ = c0849Kq0G != null ? q(c0849Kq0G, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, defpackage.InterfaceC1862Xq0 r8, int r9) {
        /*
            r6 = this;
            Kq0 r7 = (defpackage.C0849Kq0) r7
            r0 = 0
            if (r7 == 0) goto Lcf
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcf
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L3b
        L1a:
            Cq0 r1 = r7.n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.g
            if (r3 == 0) goto L2d
            android.content.Context r1 = r1.a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            Lq0 r1 = r7.A
            if (r1 == 0) goto L3a
            android.view.ActionProvider r1 = r1.b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L3a
            goto L18
        L3a:
            r1 = r0
        L3b:
            Lq0 r3 = r7.A
            if (r3 == 0) goto L49
            android.view.ActionProvider r4 = r3.b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L49
            r4 = r2
            goto L4a
        L49:
            r4 = r0
        L4a:
            boolean r5 = r7.e()
            if (r5 == 0) goto L5c
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lce
            r6.c(r2)
            goto Lce
        L5c:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6d
            if (r4 == 0) goto L65
            goto L6d
        L65:
            r7 = r9 & 1
            if (r7 != 0) goto Lce
            r6.c(r2)
            goto Lce
        L6d:
            r9 = r9 & 4
            if (r9 != 0) goto L74
            r6.c(r0)
        L74:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L88
            I51 r9 = new I51
            android.content.Context r5 = r6.a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle(r5)
        L88:
            I51 r7 = r7.o
            if (r4 == 0) goto L96
            Oq0 r9 = r3.c
            r9.getClass()
            android.view.ActionProvider r9 = r3.b
            r9.onPrepareSubMenu(r7)
        L96:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L9f
            goto Lc8
        L9f:
            if (r8 == 0) goto La5
            boolean r0 = r8.c(r7)
        La5:
            java.util.Iterator r8 = r9.iterator()
        La9:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lc8
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            Xq0 r4 = (defpackage.InterfaceC1862Xq0) r4
            if (r4 != 0) goto Lc1
            r9.remove(r3)
            goto La9
        Lc1:
            if (r0 != 0) goto La9
            boolean r0 = r4.c(r7)
            goto La9
        Lc8:
            r1 = r1 | r0
            if (r1 != 0) goto Lce
            r6.c(r2)
        Lce:
            return r1
        Lcf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MenuC0225Cq0.q(android.view.MenuItem, Xq0, int):boolean");
    }

    public final void r(InterfaceC1862Xq0 interfaceC1862Xq0) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1862Xq0 interfaceC1862Xq02 = (InterfaceC1862Xq0) weakReference.get();
            if (interfaceC1862Xq02 == null || interfaceC1862Xq02 == interfaceC1862Xq0) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0849Kq0) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0849Kq0) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0849Kq0) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((I51) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0849Kq0 c0849Kq0 = (C0849Kq0) arrayList.get(i2);
            if (c0849Kq0.b == i) {
                c0849Kq0.x = (c0849Kq0.x & (-5)) | (z2 ? 4 : 0);
                c0849Kq0.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0849Kq0 c0849Kq0 = (C0849Kq0) arrayList.get(i2);
            if (c0849Kq0.b == i) {
                c0849Kq0.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0849Kq0 c0849Kq0 = (C0849Kq0) arrayList.get(i2);
            if (c0849Kq0.b == i) {
                int i3 = c0849Kq0.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c0849Kq0.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((I51) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = AbstractC0794Jy.b(this.a, i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0849Kq0 c0849Kq0A = a(i, i2, i3, charSequence);
        I51 i51 = new I51(this.a, this, c0849Kq0A);
        c0849Kq0A.o = i51;
        i51.setHeaderTitle(c0849Kq0A.e);
        return i51;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public MenuC0225Cq0 k() {
        return this;
    }
}
