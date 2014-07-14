package li.cil.oc.common.item

import li.cil.oc.Settings

class NumPad(val parent: Delegator) extends Delegate {
  val unlocalizedName = "NumPad"

  override def registerIcons(iconRegister: IconRegister) {
    super.registerIcons(iconRegister)

    icon = iconRegister.registerIcon(Settings.resourceDomain + ":keys_numpad")
  }
}
