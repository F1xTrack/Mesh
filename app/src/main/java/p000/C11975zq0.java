package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: zq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11975zq0 extends BaseAdapter {

    /* renamed from: a */
    public final MenuC7450Cq0 f47027a;

    /* renamed from: b */
    public int f47028b = -1;

    /* renamed from: c */
    public boolean f47029c;

    /* renamed from: d */
    public final boolean f47030d;

    /* renamed from: e */
    public final LayoutInflater f47031e;

    /* renamed from: f */
    public final int f47032f;

    public C11975zq0(MenuC7450Cq0 menuC7450Cq0, LayoutInflater layoutInflater, boolean z, int i) {
        this.f47030d = z;
        this.f47031e = layoutInflater;
        this.f47027a = menuC7450Cq0;
        this.f47032f = i;
        m26557a();
    }

    /* renamed from: a */
    public final void m26557a() {
        MenuC7450Cq0 menuC7450Cq0 = this.f47027a;
        C7866Kq0 c7866Kq0 = menuC7450Cq0.f1723v;
        if (c7866Kq0 != null) {
            menuC7450Cq0.m1410i();
            ArrayList arrayList = menuC7450Cq0.f1711j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C7866Kq0) arrayList.get(i)) == c7866Kq0) {
                    this.f47028b = i;
                    return;
                }
            }
        }
        this.f47028b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C7866Kq0 getItem(int i) {
        ArrayList arrayListM1413l;
        MenuC7450Cq0 menuC7450Cq0 = this.f47027a;
        if (this.f47030d) {
            menuC7450Cq0.m1410i();
            arrayListM1413l = menuC7450Cq0.f1711j;
        } else {
            arrayListM1413l = menuC7450Cq0.m1413l();
        }
        int i2 = this.f47028b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C7866Kq0) arrayListM1413l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM1413l;
        MenuC7450Cq0 menuC7450Cq0 = this.f47027a;
        if (this.f47030d) {
            menuC7450Cq0.m1410i();
            arrayListM1413l = menuC7450Cq0.f1711j;
        } else {
            arrayListM1413l = menuC7450Cq0.m1413l();
        }
        return this.f47028b < 0 ? arrayListM1413l.size() : arrayListM1413l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f47031e.inflate(this.f47032f, viewGroup, false);
        }
        int i2 = getItem(i).f6333b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f6333b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f47027a.mo1414m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC8646Zq0 interfaceC8646Zq0 = (InterfaceC8646Zq0) view;
        if (this.f47029c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC8646Zq0.mo9614c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m26557a();
        super.notifyDataSetChanged();
    }
}
