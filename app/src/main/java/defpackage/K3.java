package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.fragment.app.g;
import androidx.fragment.app.l;

/* loaded from: classes.dex */
public class K3 extends g implements DialogInterface.OnClickListener {
    public final HJ a;

    public K3() {
        this.a = null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        HJ hj = this.a;
        if (hj != null) {
            hj.onClick(dialogInterface, i);
        }
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        l lVarRequireActivity = requireActivity();
        Bundle bundleRequireArguments = requireArguments();
        TypedArray typedArrayObtainStyledAttributes = lVarRequireActivity.obtainStyledAttributes(AbstractC2104aH0.j);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(117);
        typedArrayObtainStyledAttributes.recycle();
        if (!zHasValue) {
            AlertDialog.Builder title = new AlertDialog.Builder(lVarRequireActivity).setTitle(bundleRequireArguments.getString("title"));
            if (bundleRequireArguments.containsKey("button_positive")) {
                title.setPositiveButton(bundleRequireArguments.getString("button_positive"), this);
            }
            if (bundleRequireArguments.containsKey("button_negative")) {
                title.setNegativeButton(bundleRequireArguments.getString("button_negative"), this);
            }
            if (bundleRequireArguments.containsKey("button_neutral")) {
                title.setNeutralButton(bundleRequireArguments.getString("button_neutral"), this);
            }
            if (bundleRequireArguments.containsKey("message")) {
                title.setMessage(bundleRequireArguments.getString("message"));
            }
            if (bundleRequireArguments.containsKey("items")) {
                title.setItems(bundleRequireArguments.getCharSequenceArray("items"), this);
            }
            return title.create();
        }
        I3 title2 = new I3(lVarRequireActivity).setTitle(bundleRequireArguments.getString("title"));
        if (bundleRequireArguments.containsKey("button_positive")) {
            String string = bundleRequireArguments.getString("button_positive");
            E3 e3 = title2.a;
            e3.g = string;
            e3.h = this;
        }
        if (bundleRequireArguments.containsKey("button_negative")) {
            title2.b(bundleRequireArguments.getString("button_negative"), this);
        }
        if (bundleRequireArguments.containsKey("button_neutral")) {
            String string2 = bundleRequireArguments.getString("button_neutral");
            E3 e32 = title2.a;
            e32.k = string2;
            e32.l = this;
        }
        if (bundleRequireArguments.containsKey("message")) {
            title2.a(bundleRequireArguments.getString("message"));
        }
        if (bundleRequireArguments.containsKey("items")) {
            CharSequence[] charSequenceArray = bundleRequireArguments.getCharSequenceArray("items");
            E3 e33 = title2.a;
            e33.o = charSequenceArray;
            e33.q = this;
        }
        return title2.create();
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        HJ hj = this.a;
        if (hj != null) {
            hj.onDismiss(dialogInterface);
        }
    }

    public K3(HJ hj, Bundle bundle) {
        this.a = hj;
        setArguments(bundle);
    }
}
