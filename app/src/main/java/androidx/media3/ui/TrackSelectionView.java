package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import defpackage.C1272Qb1;
import defpackage.C1740Wb1;
import defpackage.C2168ac1;
import defpackage.C3425dc1;
import defpackage.C3513e41;
import defpackage.InterfaceC1428Sb1;
import defpackage.ViewOnClickListenerC2437c2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public final int a;
    public final LayoutInflater b;
    public final CheckedTextView c;
    public final CheckedTextView d;
    public final ViewOnClickListenerC2437c2 e;
    public final ArrayList f;
    public final HashMap g;
    public boolean h;
    public boolean i;
    public InterfaceC1428Sb1 j;
    public CheckedTextView[][] k;
    public boolean l;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.b = layoutInflaterFrom;
        ViewOnClickListenerC2437c2 viewOnClickListenerC2437c2 = new ViewOnClickListenerC2437c2(7, this);
        this.e = viewOnClickListenerC2437c2;
        this.j = new C3513e41(getResources());
        this.f = new ArrayList();
        this.g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(ru.mes.dnevnik.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC2437c2);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(ru.mes.dnevnik.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(ru.mes.dnevnik.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC2437c2);
        addView(checkedTextView2);
    }

    public final void a() {
        this.c.setChecked(this.l);
        boolean z = this.l;
        HashMap map = this.g;
        this.d.setChecked(!z && map.size() == 0);
        for (int i = 0; i < this.k.length; i++) {
            C1740Wb1 c1740Wb1 = (C1740Wb1) map.get(((C3425dc1) this.f.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (c1740Wb1 != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.k[i][i2].setChecked(c1740Wb1.b.contains(Integer.valueOf(((C2168ac1) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.TrackSelectionView.b():void");
    }

    public boolean getIsDisabled() {
        return this.l;
    }

    public Map<C1272Qb1, C1740Wb1> getOverrides() {
        return this.g;
    }

    public void setAllowAdaptiveSelections(boolean z) throws Resources.NotFoundException {
        if (this.h != z) {
            this.h = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) throws Resources.NotFoundException {
        if (this.i != z) {
            this.i = z;
            if (!z) {
                HashMap map = this.g;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f;
                    HashMap map2 = new HashMap();
                    for (int i = 0; i < arrayList.size(); i++) {
                        C1740Wb1 c1740Wb1 = (C1740Wb1) map.get(((C3425dc1) arrayList.get(i)).b);
                        if (c1740Wb1 != null && map2.isEmpty()) {
                            map2.put(c1740Wb1.a, c1740Wb1);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC1428Sb1 interfaceC1428Sb1) throws Resources.NotFoundException {
        interfaceC1428Sb1.getClass();
        this.j = interfaceC1428Sb1;
        b();
    }
}
