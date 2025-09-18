package p000;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.p002ui.TrackSelectionView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.C1932a;
import com.google.android.material.timepicker.C1952h;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import ru.mes.dnevnik.R;

/* renamed from: c2 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1822c2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f17262a;

    /* renamed from: b */
    public final /* synthetic */ Object f17263b;

    public /* synthetic */ ViewOnClickListenerC1822c2(int i, Object obj) {
        this.f17262a = i;
        this.f17263b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Message message;
        Message message2;
        Message message3;
        switch (this.f17262a) {
            case 0:
                ((AbstractC6798s2) this.f17263b).mo18163b();
                break;
            case 1:
                C0445H3 c0445h3 = (C0445H3) this.f17263b;
                Message messageObtain = (view != c0445h3.f4011i || (message3 = c0445h3.f4013k) == null) ? (view != c0445h3.f4014l || (message2 = c0445h3.f4016n) == null) ? (view != c0445h3.f4017o || (message = c0445h3.f4019q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c0445h3.f4001E.obtainMessage(1, c0445h3.f4004b).sendToTarget();
                break;
            case 2:
                C8898bo0 c8898bo0 = (C8898bo0) this.f17263b;
                int i = c8898bo0.f17164f;
                if (i != 2) {
                    if (i == 1) {
                        c8898bo0.m10523t(2);
                        break;
                    }
                } else {
                    c8898bo0.m10523t(1);
                    break;
                }
                break;
            case 3:
                C1932a c1932a = (C1932a) this.f17263b;
                InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) c1932a.getContext(), c1932a.getId());
                if (interfaceC6947uPM6091b != null) {
                    interfaceC6947uPM6091b.mo11046g(new C6846so(OZ1.m6093d(c1932a.getContext()), c1932a.getId(), 27));
                    break;
                }
                break;
            case 4:
                C0830NB c0830nb = (C0830NB) this.f17263b;
                ImageView imageView = c0830nb.f35211t;
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = c0830nb.f35204p;
                if (view != imageView) {
                    if (view != c0830nb.f35214v) {
                        if (view != c0830nb.f35213u) {
                            if (view != c0830nb.f35215w) {
                                if (view == searchView$SearchAutoComplete) {
                                    c0830nb.m22056n();
                                    break;
                                }
                            } else {
                                SearchableInfo searchableInfo = c0830nb.f35203e0;
                                if (searchableInfo != null) {
                                    try {
                                        if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                            if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                                c0830nb.getContext().startActivity(c0830nb.m22055m(c0830nb.f35184I, searchableInfo));
                                                break;
                                            }
                                        } else {
                                            Intent intent = new Intent(c0830nb.f35183H);
                                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                                            c0830nb.getContext().startActivity(intent);
                                            break;
                                        }
                                    } catch (ActivityNotFoundException unused) {
                                        return;
                                    }
                                }
                            }
                        } else {
                            c0830nb.m22061s();
                            break;
                        }
                    } else {
                        c0830nb.m22057o();
                        break;
                    }
                } else {
                    c0830nb.m22068z(false);
                    searchView$SearchAutoComplete.requestFocus();
                    searchView$SearchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener = c0830nb.f35189N;
                    if (onClickListener != null) {
                        onClickListener.onClick(c0830nb);
                        break;
                    }
                }
                break;
            case 5:
                ((C1952h) this.f17263b).m11290a(((Integer) view.getTag(R.id.selection_type)).intValue());
                break;
            case 6:
                C8745ab1 c8745ab1 = ((Toolbar) this.f17263b).f15881M;
                C7866Kq0 c7866Kq0 = c8745ab1 == null ? null : c8745ab1.f15580b;
                if (c7866Kq0 != null) {
                    c7866Kq0.collapseActionView();
                    break;
                }
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f17263b;
                CheckedTextView checkedTextView = trackSelectionView.f16417c;
                HashMap map = trackSelectionView.f16421g;
                boolean z = true;
                if (view == checkedTextView) {
                    trackSelectionView.f16426l = true;
                    map.clear();
                } else if (view == trackSelectionView.f16418d) {
                    trackSelectionView.f16426l = false;
                    map.clear();
                } else {
                    trackSelectionView.f16426l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    C8747ac1 c8747ac1 = (C8747ac1) tag;
                    C9136dc1 c9136dc1 = c8747ac1.f15587a;
                    C8149Qb1 c8149Qb1 = c9136dc1.f26162b;
                    C8461Wb1 c8461Wb1 = (C8461Wb1) map.get(c8149Qb1);
                    int i2 = c8747ac1.f15588b;
                    if (c8461Wb1 == null) {
                        if (!trackSelectionView.f16423i && map.size() > 0) {
                            map.clear();
                        }
                        map.put(c8149Qb1, new C8461Wb1(c8149Qb1, P70.m6229B(Integer.valueOf(i2))));
                    } else {
                        ArrayList arrayList = new ArrayList(c8461Wb1.f13277b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z2 = trackSelectionView.f16422h && c9136dc1.f26163c;
                        if (!z2 && (!trackSelectionView.f16423i || trackSelectionView.f16420f.size() <= 1)) {
                            z = false;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i2));
                            if (arrayList.isEmpty()) {
                                map.remove(c8149Qb1);
                            } else {
                                map.put(c8149Qb1, new C8461Wb1(c8149Qb1, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z2) {
                                arrayList.add(Integer.valueOf(i2));
                                map.put(c8149Qb1, new C8461Wb1(c8149Qb1, arrayList));
                            } else {
                                map.put(c8149Qb1, new C8461Wb1(c8149Qb1, P70.m6229B(Integer.valueOf(i2))));
                            }
                        }
                    }
                }
                trackSelectionView.m10145a();
                break;
        }
    }
}
