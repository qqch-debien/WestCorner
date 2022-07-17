import { useEffect, useState } from "react";
import styles from "./dateFooter.module.css";

export const DateFooter = () => {

	const formattedDate = () => {
		const date = new Date();
		const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };
		return date.toLocaleDateString(undefined, options);

	}

	return (
		<footer className={styles.footer}>
			<span>
				{formattedDate()}
			</span>
		</footer>
	)
}
