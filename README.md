# playerWeapon
Player and Weapon

V rámci zadania sme mali sprviť návrh tried.

Vytvoriť triedu Player, ktorá reprezentuje 1 hráča. Táto trieda obsahuje generický typ Weapon.  Každý hráč musí mať name, health a weapon. Zaručiť, aby nemohol existovať hráč bez zadanej hodnoty atribútu name. Zaručiť, aby Knight mohol používať iba zbraň Sword, Barbarian zbraň Axe a Ranger iba zbraň Bow.

Vytvoriť triedu Weapon, ktorá bude mať abstraktnú metódu getDamage(). Každý typ zbrane musí mať inú implementáciu getDamage() v závislosti od atribútov typu zbrane. Každá zbraň musí mať nejaké atribúty, na základe ktorých sa vypočíta poškodenie. Napr. Bow môže mať počet výstrelov za minútu a rýchlosť vystreleného šípu. Poškodenie getDamage() sa vypočíta ako súčin týchto atribútov.
