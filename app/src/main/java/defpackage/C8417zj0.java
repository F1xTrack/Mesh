package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* renamed from: zj0 */
/* loaded from: classes.dex */
public final class C8417zj0 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ C0048Aj0 b;

    public C8417zj0(C0048Aj0 c0048Aj0) {
        this.b = c0048Aj0;
        a();
    }

    public final void a() {
        MenuC0225Cq0 menuC0225Cq0 = this.b.c;
        C0849Kq0 c0849Kq0 = menuC0225Cq0.v;
        if (c0849Kq0 != null) {
            menuC0225Cq0.i();
            ArrayList arrayList = menuC0225Cq0.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0849Kq0) arrayList.get(i)) == c0849Kq0) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final C0849Kq0 getItem(int i) {
        C0048Aj0 c0048Aj0 = this.b;
        MenuC0225Cq0 menuC0225Cq0 = c0048Aj0.c;
        menuC0225Cq0.i();
        ArrayList arrayList = menuC0225Cq0.j;
        c0048Aj0.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0849Kq0) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0048Aj0 c0048Aj0 = this.b;
        MenuC0225Cq0 menuC0225Cq0 = c0048Aj0.c;
        menuC0225Cq0.i();
        int size = menuC0225Cq0.j.size();
        c0048Aj0.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC2018Zq0) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
