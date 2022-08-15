import styles from "./navBar.module.css";
import { BurgerLogo, TextLogo, NavLinks } from "./navBarComponents";

export const NavBar = () => {
	return(
		<div className={styles.navbar}>
			<BurgerLogo />
			<TextLogo />
			<NavLinks />
		</div>
	)
}
