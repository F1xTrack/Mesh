package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;

/* renamed from: K3 */
/* loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0634K3 extends DialogInterfaceOnCancelListenerC1725g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final DialogInterfaceOnClickListenerC0461HJ f5888a;

    public DialogInterfaceOnClickListenerC0634K3() {
        this.f5888a = null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterfaceOnClickListenerC0461HJ dialogInterfaceOnClickListenerC0461HJ = this.f5888a;
        if (dialogInterfaceOnClickListenerC0461HJ != null) {
            dialogInterfaceOnClickListenerC0461HJ.onClick(dialogInterface, i);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g
    public final Dialog onCreateDialog(Bundle bundle) {
        AbstractActivityC1730l abstractActivityC1730lRequireActivity = requireActivity();
        Bundle bundleRequireArguments = requireArguments();
        TypedArray typedArrayObtainStyledAttributes = abstractActivityC1730lRequireActivity.obtainStyledAttributes(AbstractC8704aH0.f15432j);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(117);
        typedArrayObtainStyledAttributes.recycle();
        if (!zHasValue) {
            AlertDialog.Builder title = new AlertDialog.Builder(abstractActivityC1730lRequireActivity).setTitle(bundleRequireArguments.getString("title"));
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
        C0508I3 title2 = new C0508I3(abstractActivityC1730lRequireActivity).setTitle(bundleRequireArguments.getString("title"));
        if (bundleRequireArguments.containsKey("button_positive")) {
            String string = bundleRequireArguments.getString("button_positive");
            C0256E3 c0256e3 = title2.f4670a;
            c0256e3.f2378g = string;
            c0256e3.f2379h = this;
        }
        if (bundleRequireArguments.containsKey("button_negative")) {
            title2.m3738b(bundleRequireArguments.getString("button_negative"), this);
        }
        if (bundleRequireArguments.containsKey("button_neutral")) {
            String string2 = bundleRequireArguments.getString("button_neutral");
            C0256E3 c0256e32 = title2.f4670a;
            c0256e32.f2382k = string2;
            c0256e32.f2383l = this;
        }
        if (bundleRequireArguments.containsKey("message")) {
            title2.mo3737a(bundleRequireArguments.getString("message"));
        }
        if (bundleRequireArguments.containsKey("items")) {
            CharSequence[] charSequenceArray = bundleRequireArguments.getCharSequenceArray("items");
            C0256E3 c0256e33 = title2.f4670a;
            c0256e33.f2386o = charSequenceArray;
            c0256e33.f2388q = this;
        }
        return title2.create();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterfaceOnClickListenerC0461HJ dialogInterfaceOnClickListenerC0461HJ = this.f5888a;
        if (dialogInterfaceOnClickListenerC0461HJ != null) {
            dialogInterfaceOnClickListenerC0461HJ.onDismiss(dialogInterface);
        }
    }

    public DialogInterfaceOnClickListenerC0634K3(DialogInterfaceOnClickListenerC0461HJ dialogInterfaceOnClickListenerC0461HJ, Bundle bundle) {
        this.f5888a = dialogInterfaceOnClickListenerC0461HJ;
        setArguments(bundle);
    }
}
