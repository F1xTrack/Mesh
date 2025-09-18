package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: zq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8438zq0 extends BaseAdapter {
    public final MenuC0225Cq0 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public C8438zq0(MenuC0225Cq0 menuC0225Cq0, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = menuC0225Cq0;
        this.f = i;
        a();
    }

    public final void a() {
        MenuC0225Cq0 menuC0225Cq0 = this.a;
        C0849Kq0 c0849Kq0 = menuC0225Cq0.v;
        if (c0849Kq0 != null) {
            menuC0225Cq0.i();
            ArrayList arrayList = menuC0225Cq0.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0849Kq0) arrayList.get(i)) == c0849Kq0) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0849Kq0 getItem(int i) {
        ArrayList arrayListL;
        MenuC0225Cq0 menuC0225Cq0 = this.a;
        if (this.d) {
            menuC0225Cq0.i();
            arrayListL = menuC0225Cq0.j;
        } else {
            arrayListL = menuC0225Cq0.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0849Kq0) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        MenuC0225Cq0 menuC0225Cq0 = this.a;
        if (this.d) {
            menuC0225Cq0.i();
            arrayListL = menuC0225Cq0.j;
        } else {
            arrayListL = menuC0225Cq0.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC2018Zq0 interfaceC2018Zq0 = (InterfaceC2018Zq0) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC2018Zq0.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
