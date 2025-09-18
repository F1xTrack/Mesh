package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* renamed from: zj0 */
/* loaded from: classes.dex */
public final class C11961zj0 extends BaseAdapter {

    /* renamed from: a */
    public int f46956a = -1;

    /* renamed from: b */
    public final /* synthetic */ C7332Aj0 f46957b;

    public C11961zj0(C7332Aj0 c7332Aj0) {
        this.f46957b = c7332Aj0;
        m26521a();
    }

    /* renamed from: a */
    public final void m26521a() {
        MenuC7450Cq0 menuC7450Cq0 = this.f46957b.f340c;
        C7866Kq0 c7866Kq0 = menuC7450Cq0.f1723v;
        if (c7866Kq0 != null) {
            menuC7450Cq0.m1410i();
            ArrayList arrayList = menuC7450Cq0.f1711j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C7866Kq0) arrayList.get(i)) == c7866Kq0) {
                    this.f46956a = i;
                    return;
                }
            }
        }
        this.f46956a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final C7866Kq0 getItem(int i) {
        C7332Aj0 c7332Aj0 = this.f46957b;
        MenuC7450Cq0 menuC7450Cq0 = c7332Aj0.f340c;
        menuC7450Cq0.m1410i();
        ArrayList arrayList = menuC7450Cq0.f1711j;
        c7332Aj0.getClass();
        int i2 = this.f46956a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C7866Kq0) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C7332Aj0 c7332Aj0 = this.f46957b;
        MenuC7450Cq0 menuC7450Cq0 = c7332Aj0.f340c;
        menuC7450Cq0.m1410i();
        int size = menuC7450Cq0.f1711j.size();
        c7332Aj0.getClass();
        return this.f46956a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f46957b.f339b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC8646Zq0) view).mo9614c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m26521a();
        super.notifyDataSetChanged();
    }
}
