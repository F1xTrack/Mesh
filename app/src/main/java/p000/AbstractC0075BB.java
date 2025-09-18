package p000;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: BB */
/* loaded from: classes.dex */
public abstract class AbstractC0075BB extends BaseAdapter implements Filterable {

    /* renamed from: a */
    public boolean f615a;

    /* renamed from: b */
    public boolean f616b;

    /* renamed from: c */
    public Cursor f617c;

    /* renamed from: d */
    public int f618d;

    /* renamed from: e */
    public C0317F1 f619e;

    /* renamed from: f */
    public C0012AB f620f;

    /* renamed from: g */
    public C0138CB f621g;

    /* renamed from: a */
    public abstract void mo540a(View view, Cursor cursor);

    /* renamed from: b */
    public void mo541b(Cursor cursor) {
        Cursor cursor2 = this.f617c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0317F1 c0317f1 = this.f619e;
                if (c0317f1 != null) {
                    cursor2.unregisterContentObserver(c0317f1);
                }
                C0012AB c0012ab = this.f620f;
                if (c0012ab != null) {
                    cursor2.unregisterDataSetObserver(c0012ab);
                }
            }
            this.f617c = cursor;
            if (cursor != null) {
                C0317F1 c0317f12 = this.f619e;
                if (c0317f12 != null) {
                    cursor.registerContentObserver(c0317f12);
                }
                C0012AB c0012ab2 = this.f620f;
                if (c0012ab2 != null) {
                    cursor.registerDataSetObserver(c0012ab2);
                }
                this.f618d = cursor.getColumnIndexOrThrow("_id");
                this.f615a = true;
                notifyDataSetChanged();
            } else {
                this.f618d = -1;
                this.f615a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract String mo542c(Cursor cursor);

    /* renamed from: d */
    public abstract View mo543d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f615a || (cursor = this.f617c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f615a) {
            return null;
        }
        this.f617c.moveToPosition(i);
        if (view == null) {
            ViewOnClickListenerC10224m61 viewOnClickListenerC10224m61 = (ViewOnClickListenerC10224m61) this;
            view = viewOnClickListenerC10224m61.f37475j.inflate(viewOnClickListenerC10224m61.f37474i, viewGroup, false);
        }
        mo540a(view, this.f617c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f621g == null) {
            C0138CB c0138cb = new C0138CB();
            c0138cb.f1237a = this;
            this.f621g = c0138cb;
        }
        return this.f621g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f615a || (cursor = this.f617c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f617c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f615a && (cursor = this.f617c) != null && cursor.moveToPosition(i)) {
            return this.f617c.getLong(this.f618d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f615a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f617c.moveToPosition(i)) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = mo543d(viewGroup);
        }
        mo540a(view, this.f617c);
        return view;
    }
}
